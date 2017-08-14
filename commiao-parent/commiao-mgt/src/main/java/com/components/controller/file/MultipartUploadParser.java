package com.components.controller.file;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class MultipartUploadParser {
	final Logger log = LoggerFactory.getLogger(MultipartUploadParser.class);

	private Map<String, String> params = new HashMap<String, String>();

	private List<FileItem> files = new ArrayList<FileItem>();

	// fileItemsFactory is a field (even though it's scoped to the constructor)
	// to prevent the
	// org.apache.commons.fileupload.servlet.FileCleanerCleanup thread from
	// attempting to delete the
	// temp file before while it is still being used.
	//
	// FileCleanerCleanup uses a java.lang.ref.ReferenceQueue to delete the temp
	// file when the FileItemsFactory marker object is GCed
	private DiskFileItemFactory fileItemsFactory;

	@SuppressWarnings("unchecked")
	public MultipartUploadParser(HttpServletRequest request, File repository) throws Exception {
		Boolean bol = ServletFileUpload.isMultipartContent(request);
		if(bol){
			System.out.println("是multipart/form-data数据");
		}
		if (!repository.exists() && !repository.mkdirs()) {
			throw new IOException("Unable to mkdirs to " + repository.getAbsolutePath());
		}

		fileItemsFactory = setupFileItemFactory(repository);

		ServletFileUpload upload = new ServletFileUpload(fileItemsFactory);
		List<FileItem> formFileItems = upload.parseRequest(request);

		parseFormFields(formFileItems);

		if (files.isEmpty()) {
			log.warn("No files were found when processing the requst. Debugging info follows.");

			writeDebugInfo(request);

			throw new FileUploadException("No files were found when processing the requst.");
		} else {
			if (log.isDebugEnabled()) {
				writeDebugInfo(request);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public MultipartUploadParser(HttpServletRequest request) throws Exception {
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> formFileItems = upload.parseRequest(request);
			parseFormFields(formFileItems);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		
	}

	private DiskFileItemFactory setupFileItemFactory(File repository) {
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(10 * 1024 * 1024);
		factory.setRepository(repository);

		// FileCleaningTracker pTracker =
		// FileCleanerCleanup.getFileCleaningTracker(context);
		// factory.setFileCleaningTracker(pTracker);

		return factory;
	}

	private void writeDebugInfo(HttpServletRequest request) {
		log.debug("-- POST HEADERS --");
//		for (String header : Collections.list(request.getHeaderNames())) {
//			log.debug("{}: {}", header, request.getHeader(header));
//		}

		log.debug("-- POST PARAMS --");
		for (String key : params.keySet()) {
			log.debug("{}: {}", key, params.get(key));
		}
	}

	private void parseFormFields(List<FileItem> items) throws UnsupportedEncodingException {
		for (FileItem item : items) {
			if (item.isFormField()) {
				String key = item.getFieldName();
				String value = item.getString("UTF-8");
				if (StringUtils.isNotBlank(key)) {
					params.put(key, StringUtils.defaultString(value));
				}
			} else {
				files.add(item);
			}
		}
	}

	public Map<String, String> getParams() {
		return params;
	}

	public List<FileItem> getFiles() {
		if (files.isEmpty()) {
			throw new RuntimeException("No FileItems exist.");
		}

		return files;
	}

	public FileItem getFirstFile() {
		if (files.isEmpty()) {
			throw new RuntimeException("No FileItems exist.");
		}

		return files.iterator().next();
	}
}
