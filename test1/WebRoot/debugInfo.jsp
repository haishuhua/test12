
<%@ page import = "java.util.*" %>
<p>Debug Info</p>

<h2>Form Variable:</h2>

<b>Parameters:</b><br>
<%
  Enumeration parameterList = request.getParameterNames();
  while( parameterList.hasMoreElements() )
  {
    String sName = parameterList.nextElement().toString();
   // if(sName.toLowerCase.startsWith("question")){
      String[] sMultiple = request.getParameterValues( sName );
      if( 1 >= sMultiple.length )
        // parameter has a single value. print it.
        out.println( sName + " = " + request.getParameter( sName ) + "<br>" );
      else
        for( int i=0; i<sMultiple.length; i++ )
          // if a paramater contains multiple values, print all of them
          out.println( sName + "[" + i + "] = " + sMultiple[i] + "<br>" );
   // }
  }
%>


<h2>Session Variable:</h2>

<b>Parameters:</b><br>
<%
  Enumeration parameterList2 = session.getAttributeNames();
  while( parameterList2.hasMoreElements() )
  {
    String sName = parameterList2.nextElement().toString();
   // if(sName.toLowerCase.startsWith("question")){
      String sMultiple = session.getAttribute( sName ).toString();
      //if( 1 >= sMultiple.length )
        // parameter has a single value. print it.
        out.println( sName + " = " + request.getParameter( sName ) + "<br>" );
     // else
      //  for( int i=0; i<sMultiple.length; i++ )
          // if a paramater contains multiple values, print all of them
       //   out.println( sName + "[" + i + "] = " + sMultiple[i] + "<br>" );
   // }
  }
%>