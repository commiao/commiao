package core.easyui;

import java.util.List;

/**
 * easyui的datagrid模型
 * 
 * Author ningzhitao 
 * Date   15/12/19
 * 
 */
public class TreeGrid implements java.io.Serializable {
	private static final long serialVersionUID = 2493902271764895630L;
	private String id;
	private String name;
	private String size;
	private String data;
	private String url;
	private String parentId;
	private List<TreeGrid> children;// 子节点
	private String state = "open";// 是否展开(open,closed)
	
	
	/**映射菜单类属性**/
	private String code;
	private Long menuLevel;
	private String description;
	private Integer status;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<TreeGrid> getChildren() {
		return children;
	}
	public void setChildren(List<TreeGrid> children) {
		this.children = children;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getMenuLevel() {
		return menuLevel;
	}
	public void setMenuLevel(Long menuLevel) {
		this.menuLevel = menuLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
