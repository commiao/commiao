<%@ page contentType="image/jpeg" import="java.awt.*,java.util.*,java.awt.image.*,javax.imageio.*" pageEncoding="UTF-8" %>
<%!
Color getRandColor(int fc,int bc){//给定范围获得随机颜色
  Random random = new Random();
  	if(fc>255) fc=255;
  	if(bc>255) bc=255;
  	int r=fc+random.nextInt(bc-fc);
  	int g=fc+random.nextInt(bc-fc);
  	int b=fc+random.nextInt(bc-fc);
  		return new Color(r,g,b);
  }
%>
<%
//设置页面不缓存
response.setHeader("Pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", 0);

// 在内存中创建图象
int width=104, height=34;
BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

// 获取图形上下文
Graphics g = image.getGraphics();

//生成随机类
Random random = new Random();

// 设定背景色
g.setColor(Color.GRAY);
g.drawRect(0, 0, width, height);
g.setColor(Color.white);
g.fillRect(1, 1, width-2, height-2);
//设定字体
g.setFont(new Font("宋体",Font.BOLD,25));


// 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
g.setColor(new Color(125,93,100));
for (int i=0;i<50;i++)
{
  int x = random.nextInt(width);
  int y = random.nextInt(height);
  int xl = random.nextInt(12);
  int yl = random.nextInt(12);
  g.drawLine(i%20==0?0:x,(i%2-1)==0?0:y,x+xl+20,y+yl+20);
}

// 取随机产生的认证码(4位数字)

String codeList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

String sRand="";


for (int i=0;i<4;i++){
int a=random.nextInt(codeList.length()-1);
  String rand=codeList.substring(a,a+1);
  sRand+=rand;
  // 将认证码显示到图象中
  g.setColor(new Color(255,0,0));//调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
  //g.translate(random.nextInt(3), random.nextInt(3));
  g.drawString(rand,23*i+6,26);
}

// 将认证码存入SESSION
session.removeAttribute("rand");
session.setAttribute("rand",sRand);
// 图象生效
g.dispose();

// 输出图象到页面
ImageIO.write(image, "JPEG", response.getOutputStream());
out.clear();
out = pageContext.pushBody();


%>

