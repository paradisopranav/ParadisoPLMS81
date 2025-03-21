<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Skip to main contentCDATAdocument.body_c5c132</name>
   <tag></tag>
   <elementGuidId>cc16d1eb-e8c9-417b-a757-ae513ff3a31e</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body[@id='page-login-index']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#page-login-index</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>d92d59bf-62db-4441-aaa1-501d2e8516e3</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>page-login-index</value>
      <webElementGuid>407a6666-c03d-4e84-be82-5e1625484343</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>format-site  path-login chrome dir-ltr lang-en yui-skin-sam yui3-skin-sam plms-php81-paradisolms-net pagelayout-login course-1 context-1 notloggedin indra_popup_rendering jsenabled</value>
      <webElementGuid>a3247d9b-d4d9-44b6-be0f-2c1ccebfeeac</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>



    
    Skip to main content




//&lt;![CDATA[
document.body.className += ' jsenabled';
//]]&gt;




        
        
            
            
            
                
                    
                        
                            
                                    
                            
                            
                            
                                Login Into your account to continue with your learning experience.  
                            

                                
                                    Skip to create new account
                                

                            
                                
                                    
                                        
                                            
                                            
                                            document.getElementById('anchor').value = location.hash;
                                            Username
                                            
                                                
                                                
                                                
                                                        Username
                                                
                                                
                                                
                                            
                                            Password
                                            Forgot your password?
                                            
                                            
                                                
                                                Password
                                                
                                                
                                                
                                                
                                            
                                            
                                            
                                             
    
        
        
        English ‎(en)‎     
    
    
                English ‎(en)‎
                Español - Internacional ‎(es)‎
                Japanese ‎(ja_kids)‎
                हिंदी ‎(hi)‎
                日本語 ‎(ja)‎
    

                                            
                                                
                                                    
                                                    Keep me logged in
                                                
                                            
                                            
                                            Log in
                                            
                                        
                                    
                                    
                                
                                
                                    
                                        Or you can join with
                                        
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                        
                                    
                                    
                                                       
                            
                                    
                                        Don’t have an  account? Create An Account   
                                    
                        
                    
                
            
        
                
                Powered by ParadisoLMS
                
            
        
    




    

        
        
            
                    
                        Powered by Paradiso LMS 
                    
            
        
        
//&lt;![CDATA[
var require = {
    baseUrl : 'https://plms-php81.paradisolms.net/lib/requirejs.php/1742541316/',
    // We only support AMD modules with an explicit define() statement.
    enforceDefine: true,
    skipDataMain: true,
    waitSeconds : 0,

    paths: {
      jquery: 'https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/jquery/jquery-3.6.4.min',
      jqueryui: 'https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/jquery/ui-1.13.2/jquery-ui.min',
      jqueryprivate: 'https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/requirejs/jquery-private'
    },

    // Custom jquery config map.
    map: {
      // '*' means all modules will get 'jqueryprivate'
      // for their 'jquery' dependency.
      '*': { jquery: 'jqueryprivate' },
      // Stub module for 'process'. This is a workaround for a bug in MathJax (see MDL-60458).
      '*': { process: 'core/first' },

      // 'jquery-private' wants the real jQuery module
      // though. If this line was not here, there would
      // be an unresolvable cyclic dependency.
      jqueryprivate: { jquery: 'jquery' }
    }
};

//]]&gt;



//&lt;![CDATA[
M.util.js_pending(&quot;core/first&quot;);require(['core/first'], function() {
require(['core/prefetch']);
;
require([&quot;media_videojs/loader&quot;], function(loader) {
    loader.setUp(function(videojs) {
        videojs.options.flash.swf = &quot;https://plms-php81.paradisolms.net/media/player/videojs/videojs/video-js.swf&quot;;
videojs.addLanguage('en', {
  &quot;Audio Player&quot;: &quot;Audio Player&quot;,
  &quot;Video Player&quot;: &quot;Video Player&quot;,
  &quot;Play&quot;: &quot;Play&quot;,
  &quot;Pause&quot;: &quot;Pause&quot;,
  &quot;Replay&quot;: &quot;Replay&quot;,
  &quot;Current Time&quot;: &quot;Current Time&quot;,
  &quot;Duration&quot;: &quot;Duration&quot;,
  &quot;Remaining Time&quot;: &quot;Remaining Time&quot;,
  &quot;Stream Type&quot;: &quot;Stream Type&quot;,
  &quot;LIVE&quot;: &quot;LIVE&quot;,
  &quot;Seek to live, currently behind live&quot;: &quot;Seek to live, currently behind live&quot;,
  &quot;Seek to live, currently playing live&quot;: &quot;Seek to live, currently playing live&quot;,
  &quot;Loaded&quot;: &quot;Loaded&quot;,
  &quot;Progress&quot;: &quot;Progress&quot;,
  &quot;Progress Bar&quot;: &quot;Progress Bar&quot;,
  &quot;progress bar timing: currentTime={1} duration={2}&quot;: &quot;{1} of {2}&quot;,
  &quot;Fullscreen&quot;: &quot;Fullscreen&quot;,
  &quot;Non-Fullscreen&quot;: &quot;Non-Fullscreen&quot;,
  &quot;Mute&quot;: &quot;Mute&quot;,
  &quot;Unmute&quot;: &quot;Unmute&quot;,
  &quot;Playback Rate&quot;: &quot;Playback Rate&quot;,
  &quot;Subtitles&quot;: &quot;Subtitles&quot;,
  &quot;subtitles off&quot;: &quot;subtitles off&quot;,
  &quot;Captions&quot;: &quot;Captions&quot;,
  &quot;captions off&quot;: &quot;captions off&quot;,
  &quot;Chapters&quot;: &quot;Chapters&quot;,
  &quot;Descriptions&quot;: &quot;Descriptions&quot;,
  &quot;descriptions off&quot;: &quot;descriptions off&quot;,
  &quot;Audio Track&quot;: &quot;Audio Track&quot;,
  &quot;Volume Level&quot;: &quot;Volume Level&quot;,
  &quot;You aborted the media playback&quot;: &quot;You aborted the media playback&quot;,
  &quot;A network error caused the media download to fail part-way.&quot;: &quot;A network error caused the media download to fail part-way.&quot;,
  &quot;The media could not be loaded, either because the server or network failed or because the format is not supported.&quot;: &quot;The media could not be loaded, either because the server or network failed or because the format is not supported.&quot;,
  &quot;The media playback was aborted due to a corruption problem or because the media used features your browser did not support.&quot;: &quot;The media playback was aborted due to a corruption problem or because the media used features your browser did not support.&quot;,
  &quot;No compatible source was found for this media.&quot;: &quot;No compatible source was found for this media.&quot;,
  &quot;The media is encrypted and we do not have the keys to decrypt it.&quot;: &quot;The media is encrypted and we do not have the keys to decrypt it.&quot;,
  &quot;Play Video&quot;: &quot;Play Video&quot;,
  &quot;Close&quot;: &quot;Close&quot;,
  &quot;Close Modal Dialog&quot;: &quot;Close Modal Dialog&quot;,
  &quot;Modal Window&quot;: &quot;Modal Window&quot;,
  &quot;This is a modal window&quot;: &quot;This is a modal window&quot;,
  &quot;This modal can be closed by pressing the Escape key or activating the close button.&quot;: &quot;This modal can be closed by pressing the Escape key or activating the close button.&quot;,
  &quot;, opens captions settings dialog&quot;: &quot;, opens captions settings dialog&quot;,
  &quot;, opens subtitles settings dialog&quot;: &quot;, opens subtitles settings dialog&quot;,
  &quot;, opens descriptions settings dialog&quot;: &quot;, opens descriptions settings dialog&quot;,
  &quot;, selected&quot;: &quot;, selected&quot;,
  &quot;captions settings&quot;: &quot;captions settings&quot;,
  &quot;subtitles settings&quot;: &quot;subtitles settings&quot;,
  &quot;descriptions settings&quot;: &quot;descriptions settings&quot;,
  &quot;Text&quot;: &quot;Text&quot;,
  &quot;White&quot;: &quot;White&quot;,
  &quot;Black&quot;: &quot;Black&quot;,
  &quot;Red&quot;: &quot;Red&quot;,
  &quot;Green&quot;: &quot;Green&quot;,
  &quot;Blue&quot;: &quot;Blue&quot;,
  &quot;Yellow&quot;: &quot;Yellow&quot;,
  &quot;Magenta&quot;: &quot;Magenta&quot;,
  &quot;Cyan&quot;: &quot;Cyan&quot;,
  &quot;Background&quot;: &quot;Background&quot;,
  &quot;Window&quot;: &quot;Window&quot;,
  &quot;Transparent&quot;: &quot;Transparent&quot;,
  &quot;Semi-Transparent&quot;: &quot;Semi-Transparent&quot;,
  &quot;Opaque&quot;: &quot;Opaque&quot;,
  &quot;Font Size&quot;: &quot;Font Size&quot;,
  &quot;Text Edge Style&quot;: &quot;Text Edge Style&quot;,
  &quot;None&quot;: &quot;None&quot;,
  &quot;Raised&quot;: &quot;Raised&quot;,
  &quot;Depressed&quot;: &quot;Depressed&quot;,
  &quot;Uniform&quot;: &quot;Uniform&quot;,
  &quot;Dropshadow&quot;: &quot;Dropshadow&quot;,
  &quot;Font Family&quot;: &quot;Font Family&quot;,
  &quot;Proportional Sans-Serif&quot;: &quot;Proportional Sans-Serif&quot;,
  &quot;Monospace Sans-Serif&quot;: &quot;Monospace Sans-Serif&quot;,
  &quot;Proportional Serif&quot;: &quot;Proportional Serif&quot;,
  &quot;Monospace Serif&quot;: &quot;Monospace Serif&quot;,
  &quot;Casual&quot;: &quot;Casual&quot;,
  &quot;Script&quot;: &quot;Script&quot;,
  &quot;Small Caps&quot;: &quot;Small Caps&quot;,
  &quot;Reset&quot;: &quot;Reset&quot;,
  &quot;restore all settings to the default values&quot;: &quot;restore all settings to the default values&quot;,
  &quot;Done&quot;: &quot;Done&quot;,
  &quot;Caption Settings Dialog&quot;: &quot;Caption Settings Dialog&quot;,
  &quot;Beginning of dialog window. Escape will cancel and close the window.&quot;: &quot;Beginning of dialog window. Escape will cancel and close the window.&quot;,
  &quot;End of dialog window.&quot;: &quot;End of dialog window.&quot;,
  &quot;{1} is loading.&quot;: &quot;{1} is loading.&quot;,
  &quot;Exit Picture-in-Picture&quot;: &quot;Exit Picture-in-Picture&quot;,
  &quot;Picture-in-Picture&quot;: &quot;Picture-in-Picture&quot;
});

    });
});;


require(['jquery', 'tool_policy/jquery-eu-cookie-law-popup', 'tool_policy/policyactions'], function($, Popup, ActionsMod) {
        // Initialise the guest popup.
        $(document).ready(function() {
            // Only show message if there is some policy related to guests.

            // Initialise the JS for the modal window which displays the policy versions.
            ActionsMod.init('[data-action=&quot;view-guest&quot;]');
        });
});

;

require(['theme_boost/loader']);
;

require(['jquery', 'core/custom_interaction_events'], function($, CustomEvents) {
    CustomEvents.define('#single_select67dd1cac9c7483', [CustomEvents.events.accessibleChange]);
    $('#single_select67dd1cac9c7483').on(CustomEvents.events.accessibleChange, function() {
        var ignore = $(this).find(':selected').attr('data-ignore');
        if (typeof ignore === typeof undefined) {
            $('#single_select_f67dd1cac9c7482').submit();
        }
    });
});
;


        require(['core_form/passwordunmask'], function(PasswordUnmask) {
    new PasswordUnmask(&quot;&quot;);
});

$('#passwordunmask').click(function(){
    var typeval = $('#password').attr('type');
    if(typeval==&quot;text&quot;) {
        $(&quot;.fa-eye&quot;).removeClass(&quot;fa-eye-slash&quot;);
        $('#password').removeAttr('type','text').attr('type','password');
        $('#eyeid').attr('title', 'Show');
    } else {
        $(&quot;.fa-eye&quot;).addClass(&quot;fa-eye-slash&quot;);
        $('#password').removeAttr('type','password').attr('type','text');
        $('#eyeid').attr('title', 'Hide');
    }
    $('#password').focus();
});

    ;
M.util.js_pending('core/notification'); require(['core/notification'], function(amd) {amd.init(1, [], false); M.util.js_complete('core/notification');});;
M.util.js_pending('core/log'); require(['core/log'], function(amd) {amd.setConfig({&quot;level&quot;:&quot;warn&quot;}); M.util.js_complete('core/log');});;
M.util.js_pending('core/page_global'); require(['core/page_global'], function(amd) {amd.init(); M.util.js_complete('core/page_global');});M.util.js_complete(&quot;core/first&quot;);
});
//]]&gt;




//&lt;![CDATA[
M.str = {&quot;moodle&quot;:{&quot;lastmodified&quot;:&quot;Last modified&quot;,&quot;name&quot;:&quot;Name&quot;,&quot;error&quot;:&quot;Error&quot;,&quot;info&quot;:&quot;Information&quot;,&quot;yes&quot;:&quot;Yes&quot;,&quot;no&quot;:&quot;No&quot;,&quot;cancel&quot;:&quot;Cancel&quot;,&quot;confirm&quot;:&quot;Confirm&quot;,&quot;areyousure&quot;:&quot;Are you sure?&quot;,&quot;closebuttontitle&quot;:&quot;Close&quot;,&quot;unknownerror&quot;:&quot;Unknown error&quot;,&quot;file&quot;:&quot;File&quot;,&quot;url&quot;:&quot;URL&quot;},&quot;repository&quot;:{&quot;type&quot;:&quot;Type&quot;,&quot;size&quot;:&quot;Size&quot;,&quot;invalidjson&quot;:&quot;Invalid JSON string&quot;,&quot;nofilesattached&quot;:&quot;No files attached&quot;,&quot;filepicker&quot;:&quot;File picker&quot;,&quot;logout&quot;:&quot;Logout&quot;,&quot;nofilesavailable&quot;:&quot;No files available&quot;,&quot;norepositoriesavailable&quot;:&quot;Sorry, none of your current repositories can return files in the required format.&quot;,&quot;fileexistsdialogheader&quot;:&quot;File exists&quot;,&quot;fileexistsdialog_editor&quot;:&quot;A file with that name has already been attached to the text you are editing.&quot;,&quot;fileexistsdialog_filemanager&quot;:&quot;A file with that name has already been attached&quot;,&quot;renameto&quot;:&quot;Rename to \&quot;{$a}\&quot;&quot;,&quot;referencesexist&quot;:&quot;There are {$a} alias\/shortcut files that use this file as their source&quot;,&quot;select&quot;:&quot;Select&quot;},&quot;admin&quot;:{&quot;confirmdeletecomments&quot;:&quot;You are about to delete comments, are you sure?&quot;,&quot;confirmation&quot;:&quot;Confirmation&quot;},&quot;debug&quot;:{&quot;debuginfo&quot;:&quot;Debug info&quot;,&quot;line&quot;:&quot;Line&quot;,&quot;stacktrace&quot;:&quot;Stack trace&quot;},&quot;langconfig&quot;:{&quot;labelsep&quot;:&quot;: &quot;}};
//]]&gt;


//&lt;![CDATA[
(function() {M.util.help_popups.setup(Y);
 M.util.js_pending('random67dd1cac9c7485'); Y.on('domready', function() { M.util.js_complete(&quot;init&quot;);  M.util.js_complete('random67dd1cac9c7485'); });
})();
//]]&gt;



    



</value>
      <webElementGuid>221680e5-761d-406e-a825-e5b1c94f32f9</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;page-login-index&quot;)</value>
      <webElementGuid>9a7aad31-7ffa-473c-b451-fccce220a654</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//body[@id='page-login-index']</value>
      <webElementGuid>fdf59d15-e7af-44ea-b71a-633dfbc8c0f3</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>42cae12f-8844-4140-ad92-9918cf073dd4</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[@id = 'page-login-index' and (text() = concat(&quot;



    
    Skip to main content




//&lt;![CDATA[
document.body.className += &quot; , &quot;'&quot; , &quot; jsenabled&quot; , &quot;'&quot; , &quot;;
//]]&gt;




        
        
            
            
            
                
                    
                        
                            
                                    
                            
                            
                            
                                Login Into your account to continue with your learning experience.  
                            

                                
                                    Skip to create new account
                                

                            
                                
                                    
                                        
                                            
                                            
                                            document.getElementById(&quot; , &quot;'&quot; , &quot;anchor&quot; , &quot;'&quot; , &quot;).value = location.hash;
                                            Username
                                            
                                                
                                                
                                                
                                                        Username
                                                
                                                
                                                
                                            
                                            Password
                                            Forgot your password?
                                            
                                            
                                                
                                                Password
                                                
                                                
                                                
                                                
                                            
                                            
                                            
                                             
    
        
        
        English ‎(en)‎     
    
    
                English ‎(en)‎
                Español - Internacional ‎(es)‎
                Japanese ‎(ja_kids)‎
                हिंदी ‎(hi)‎
                日本語 ‎(ja)‎
    

                                            
                                                
                                                    
                                                    Keep me logged in
                                                
                                            
                                            
                                            Log in
                                            
                                        
                                    
                                    
                                
                                
                                    
                                        Or you can join with
                                        
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                        
                                    
                                    
                                                       
                            
                                    
                                        Don’t have an  account? Create An Account   
                                    
                        
                    
                
            
        
                
                Powered by ParadisoLMS
                
            
        
    




    

        
        
            
                    
                        Powered by Paradiso LMS 
                    
            
        
        
//&lt;![CDATA[
var require = {
    baseUrl : &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/requirejs.php/1742541316/&quot; , &quot;'&quot; , &quot;,
    // We only support AMD modules with an explicit define() statement.
    enforceDefine: true,
    skipDataMain: true,
    waitSeconds : 0,

    paths: {
      jquery: &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/jquery/jquery-3.6.4.min&quot; , &quot;'&quot; , &quot;,
      jqueryui: &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/jquery/ui-1.13.2/jquery-ui.min&quot; , &quot;'&quot; , &quot;,
      jqueryprivate: &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/requirejs/jquery-private&quot; , &quot;'&quot; , &quot;
    },

    // Custom jquery config map.
    map: {
      // &quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot; means all modules will get &quot; , &quot;'&quot; , &quot;jqueryprivate&quot; , &quot;'&quot; , &quot;
      // for their &quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot; dependency.
      &quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot;: { jquery: &quot; , &quot;'&quot; , &quot;jqueryprivate&quot; , &quot;'&quot; , &quot; },
      // Stub module for &quot; , &quot;'&quot; , &quot;process&quot; , &quot;'&quot; , &quot;. This is a workaround for a bug in MathJax (see MDL-60458).
      &quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot;: { process: &quot; , &quot;'&quot; , &quot;core/first&quot; , &quot;'&quot; , &quot; },

      // &quot; , &quot;'&quot; , &quot;jquery-private&quot; , &quot;'&quot; , &quot; wants the real jQuery module
      // though. If this line was not here, there would
      // be an unresolvable cyclic dependency.
      jqueryprivate: { jquery: &quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot; }
    }
};

//]]&gt;



//&lt;![CDATA[
M.util.js_pending(&quot;core/first&quot;);require([&quot; , &quot;'&quot; , &quot;core/first&quot; , &quot;'&quot; , &quot;], function() {
require([&quot; , &quot;'&quot; , &quot;core/prefetch&quot; , &quot;'&quot; , &quot;]);
;
require([&quot;media_videojs/loader&quot;], function(loader) {
    loader.setUp(function(videojs) {
        videojs.options.flash.swf = &quot;https://plms-php81.paradisolms.net/media/player/videojs/videojs/video-js.swf&quot;;
videojs.addLanguage(&quot; , &quot;'&quot; , &quot;en&quot; , &quot;'&quot; , &quot;, {
  &quot;Audio Player&quot;: &quot;Audio Player&quot;,
  &quot;Video Player&quot;: &quot;Video Player&quot;,
  &quot;Play&quot;: &quot;Play&quot;,
  &quot;Pause&quot;: &quot;Pause&quot;,
  &quot;Replay&quot;: &quot;Replay&quot;,
  &quot;Current Time&quot;: &quot;Current Time&quot;,
  &quot;Duration&quot;: &quot;Duration&quot;,
  &quot;Remaining Time&quot;: &quot;Remaining Time&quot;,
  &quot;Stream Type&quot;: &quot;Stream Type&quot;,
  &quot;LIVE&quot;: &quot;LIVE&quot;,
  &quot;Seek to live, currently behind live&quot;: &quot;Seek to live, currently behind live&quot;,
  &quot;Seek to live, currently playing live&quot;: &quot;Seek to live, currently playing live&quot;,
  &quot;Loaded&quot;: &quot;Loaded&quot;,
  &quot;Progress&quot;: &quot;Progress&quot;,
  &quot;Progress Bar&quot;: &quot;Progress Bar&quot;,
  &quot;progress bar timing: currentTime={1} duration={2}&quot;: &quot;{1} of {2}&quot;,
  &quot;Fullscreen&quot;: &quot;Fullscreen&quot;,
  &quot;Non-Fullscreen&quot;: &quot;Non-Fullscreen&quot;,
  &quot;Mute&quot;: &quot;Mute&quot;,
  &quot;Unmute&quot;: &quot;Unmute&quot;,
  &quot;Playback Rate&quot;: &quot;Playback Rate&quot;,
  &quot;Subtitles&quot;: &quot;Subtitles&quot;,
  &quot;subtitles off&quot;: &quot;subtitles off&quot;,
  &quot;Captions&quot;: &quot;Captions&quot;,
  &quot;captions off&quot;: &quot;captions off&quot;,
  &quot;Chapters&quot;: &quot;Chapters&quot;,
  &quot;Descriptions&quot;: &quot;Descriptions&quot;,
  &quot;descriptions off&quot;: &quot;descriptions off&quot;,
  &quot;Audio Track&quot;: &quot;Audio Track&quot;,
  &quot;Volume Level&quot;: &quot;Volume Level&quot;,
  &quot;You aborted the media playback&quot;: &quot;You aborted the media playback&quot;,
  &quot;A network error caused the media download to fail part-way.&quot;: &quot;A network error caused the media download to fail part-way.&quot;,
  &quot;The media could not be loaded, either because the server or network failed or because the format is not supported.&quot;: &quot;The media could not be loaded, either because the server or network failed or because the format is not supported.&quot;,
  &quot;The media playback was aborted due to a corruption problem or because the media used features your browser did not support.&quot;: &quot;The media playback was aborted due to a corruption problem or because the media used features your browser did not support.&quot;,
  &quot;No compatible source was found for this media.&quot;: &quot;No compatible source was found for this media.&quot;,
  &quot;The media is encrypted and we do not have the keys to decrypt it.&quot;: &quot;The media is encrypted and we do not have the keys to decrypt it.&quot;,
  &quot;Play Video&quot;: &quot;Play Video&quot;,
  &quot;Close&quot;: &quot;Close&quot;,
  &quot;Close Modal Dialog&quot;: &quot;Close Modal Dialog&quot;,
  &quot;Modal Window&quot;: &quot;Modal Window&quot;,
  &quot;This is a modal window&quot;: &quot;This is a modal window&quot;,
  &quot;This modal can be closed by pressing the Escape key or activating the close button.&quot;: &quot;This modal can be closed by pressing the Escape key or activating the close button.&quot;,
  &quot;, opens captions settings dialog&quot;: &quot;, opens captions settings dialog&quot;,
  &quot;, opens subtitles settings dialog&quot;: &quot;, opens subtitles settings dialog&quot;,
  &quot;, opens descriptions settings dialog&quot;: &quot;, opens descriptions settings dialog&quot;,
  &quot;, selected&quot;: &quot;, selected&quot;,
  &quot;captions settings&quot;: &quot;captions settings&quot;,
  &quot;subtitles settings&quot;: &quot;subtitles settings&quot;,
  &quot;descriptions settings&quot;: &quot;descriptions settings&quot;,
  &quot;Text&quot;: &quot;Text&quot;,
  &quot;White&quot;: &quot;White&quot;,
  &quot;Black&quot;: &quot;Black&quot;,
  &quot;Red&quot;: &quot;Red&quot;,
  &quot;Green&quot;: &quot;Green&quot;,
  &quot;Blue&quot;: &quot;Blue&quot;,
  &quot;Yellow&quot;: &quot;Yellow&quot;,
  &quot;Magenta&quot;: &quot;Magenta&quot;,
  &quot;Cyan&quot;: &quot;Cyan&quot;,
  &quot;Background&quot;: &quot;Background&quot;,
  &quot;Window&quot;: &quot;Window&quot;,
  &quot;Transparent&quot;: &quot;Transparent&quot;,
  &quot;Semi-Transparent&quot;: &quot;Semi-Transparent&quot;,
  &quot;Opaque&quot;: &quot;Opaque&quot;,
  &quot;Font Size&quot;: &quot;Font Size&quot;,
  &quot;Text Edge Style&quot;: &quot;Text Edge Style&quot;,
  &quot;None&quot;: &quot;None&quot;,
  &quot;Raised&quot;: &quot;Raised&quot;,
  &quot;Depressed&quot;: &quot;Depressed&quot;,
  &quot;Uniform&quot;: &quot;Uniform&quot;,
  &quot;Dropshadow&quot;: &quot;Dropshadow&quot;,
  &quot;Font Family&quot;: &quot;Font Family&quot;,
  &quot;Proportional Sans-Serif&quot;: &quot;Proportional Sans-Serif&quot;,
  &quot;Monospace Sans-Serif&quot;: &quot;Monospace Sans-Serif&quot;,
  &quot;Proportional Serif&quot;: &quot;Proportional Serif&quot;,
  &quot;Monospace Serif&quot;: &quot;Monospace Serif&quot;,
  &quot;Casual&quot;: &quot;Casual&quot;,
  &quot;Script&quot;: &quot;Script&quot;,
  &quot;Small Caps&quot;: &quot;Small Caps&quot;,
  &quot;Reset&quot;: &quot;Reset&quot;,
  &quot;restore all settings to the default values&quot;: &quot;restore all settings to the default values&quot;,
  &quot;Done&quot;: &quot;Done&quot;,
  &quot;Caption Settings Dialog&quot;: &quot;Caption Settings Dialog&quot;,
  &quot;Beginning of dialog window. Escape will cancel and close the window.&quot;: &quot;Beginning of dialog window. Escape will cancel and close the window.&quot;,
  &quot;End of dialog window.&quot;: &quot;End of dialog window.&quot;,
  &quot;{1} is loading.&quot;: &quot;{1} is loading.&quot;,
  &quot;Exit Picture-in-Picture&quot;: &quot;Exit Picture-in-Picture&quot;,
  &quot;Picture-in-Picture&quot;: &quot;Picture-in-Picture&quot;
});

    });
});;


require([&quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;tool_policy/jquery-eu-cookie-law-popup&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;tool_policy/policyactions&quot; , &quot;'&quot; , &quot;], function($, Popup, ActionsMod) {
        // Initialise the guest popup.
        $(document).ready(function() {
            // Only show message if there is some policy related to guests.

            // Initialise the JS for the modal window which displays the policy versions.
            ActionsMod.init(&quot; , &quot;'&quot; , &quot;[data-action=&quot;view-guest&quot;]&quot; , &quot;'&quot; , &quot;);
        });
});

;

require([&quot; , &quot;'&quot; , &quot;theme_boost/loader&quot; , &quot;'&quot; , &quot;]);
;

require([&quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;core/custom_interaction_events&quot; , &quot;'&quot; , &quot;], function($, CustomEvents) {
    CustomEvents.define(&quot; , &quot;'&quot; , &quot;#single_select67dd1cac9c7483&quot; , &quot;'&quot; , &quot;, [CustomEvents.events.accessibleChange]);
    $(&quot; , &quot;'&quot; , &quot;#single_select67dd1cac9c7483&quot; , &quot;'&quot; , &quot;).on(CustomEvents.events.accessibleChange, function() {
        var ignore = $(this).find(&quot; , &quot;'&quot; , &quot;:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;data-ignore&quot; , &quot;'&quot; , &quot;);
        if (typeof ignore === typeof undefined) {
            $(&quot; , &quot;'&quot; , &quot;#single_select_f67dd1cac9c7482&quot; , &quot;'&quot; , &quot;).submit();
        }
    });
});
;


        require([&quot; , &quot;'&quot; , &quot;core_form/passwordunmask&quot; , &quot;'&quot; , &quot;], function(PasswordUnmask) {
    new PasswordUnmask(&quot;&quot;);
});

$(&quot; , &quot;'&quot; , &quot;#passwordunmask&quot; , &quot;'&quot; , &quot;).click(function(){
    var typeval = $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;);
    if(typeval==&quot;text&quot;) {
        $(&quot;.fa-eye&quot;).removeClass(&quot;fa-eye-slash&quot;);
        $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).removeAttr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;);
        $(&quot; , &quot;'&quot; , &quot;#eyeid&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;title&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;Show&quot; , &quot;'&quot; , &quot;);
    } else {
        $(&quot;.fa-eye&quot;).addClass(&quot;fa-eye-slash&quot;);
        $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).removeAttr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;);
        $(&quot; , &quot;'&quot; , &quot;#eyeid&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;title&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;Hide&quot; , &quot;'&quot; , &quot;);
    }
    $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).focus();
});

    ;
M.util.js_pending(&quot; , &quot;'&quot; , &quot;core/notification&quot; , &quot;'&quot; , &quot;); require([&quot; , &quot;'&quot; , &quot;core/notification&quot; , &quot;'&quot; , &quot;], function(amd) {amd.init(1, [], false); M.util.js_complete(&quot; , &quot;'&quot; , &quot;core/notification&quot; , &quot;'&quot; , &quot;);});;
M.util.js_pending(&quot; , &quot;'&quot; , &quot;core/log&quot; , &quot;'&quot; , &quot;); require([&quot; , &quot;'&quot; , &quot;core/log&quot; , &quot;'&quot; , &quot;], function(amd) {amd.setConfig({&quot;level&quot;:&quot;warn&quot;}); M.util.js_complete(&quot; , &quot;'&quot; , &quot;core/log&quot; , &quot;'&quot; , &quot;);});;
M.util.js_pending(&quot; , &quot;'&quot; , &quot;core/page_global&quot; , &quot;'&quot; , &quot;); require([&quot; , &quot;'&quot; , &quot;core/page_global&quot; , &quot;'&quot; , &quot;], function(amd) {amd.init(); M.util.js_complete(&quot; , &quot;'&quot; , &quot;core/page_global&quot; , &quot;'&quot; , &quot;);});M.util.js_complete(&quot;core/first&quot;);
});
//]]&gt;




//&lt;![CDATA[
M.str = {&quot;moodle&quot;:{&quot;lastmodified&quot;:&quot;Last modified&quot;,&quot;name&quot;:&quot;Name&quot;,&quot;error&quot;:&quot;Error&quot;,&quot;info&quot;:&quot;Information&quot;,&quot;yes&quot;:&quot;Yes&quot;,&quot;no&quot;:&quot;No&quot;,&quot;cancel&quot;:&quot;Cancel&quot;,&quot;confirm&quot;:&quot;Confirm&quot;,&quot;areyousure&quot;:&quot;Are you sure?&quot;,&quot;closebuttontitle&quot;:&quot;Close&quot;,&quot;unknownerror&quot;:&quot;Unknown error&quot;,&quot;file&quot;:&quot;File&quot;,&quot;url&quot;:&quot;URL&quot;},&quot;repository&quot;:{&quot;type&quot;:&quot;Type&quot;,&quot;size&quot;:&quot;Size&quot;,&quot;invalidjson&quot;:&quot;Invalid JSON string&quot;,&quot;nofilesattached&quot;:&quot;No files attached&quot;,&quot;filepicker&quot;:&quot;File picker&quot;,&quot;logout&quot;:&quot;Logout&quot;,&quot;nofilesavailable&quot;:&quot;No files available&quot;,&quot;norepositoriesavailable&quot;:&quot;Sorry, none of your current repositories can return files in the required format.&quot;,&quot;fileexistsdialogheader&quot;:&quot;File exists&quot;,&quot;fileexistsdialog_editor&quot;:&quot;A file with that name has already been attached to the text you are editing.&quot;,&quot;fileexistsdialog_filemanager&quot;:&quot;A file with that name has already been attached&quot;,&quot;renameto&quot;:&quot;Rename to \&quot;{$a}\&quot;&quot;,&quot;referencesexist&quot;:&quot;There are {$a} alias\/shortcut files that use this file as their source&quot;,&quot;select&quot;:&quot;Select&quot;},&quot;admin&quot;:{&quot;confirmdeletecomments&quot;:&quot;You are about to delete comments, are you sure?&quot;,&quot;confirmation&quot;:&quot;Confirmation&quot;},&quot;debug&quot;:{&quot;debuginfo&quot;:&quot;Debug info&quot;,&quot;line&quot;:&quot;Line&quot;,&quot;stacktrace&quot;:&quot;Stack trace&quot;},&quot;langconfig&quot;:{&quot;labelsep&quot;:&quot;: &quot;}};
//]]&gt;


//&lt;![CDATA[
(function() {M.util.help_popups.setup(Y);
 M.util.js_pending(&quot; , &quot;'&quot; , &quot;random67dd1cac9c7485&quot; , &quot;'&quot; , &quot;); Y.on(&quot; , &quot;'&quot; , &quot;domready&quot; , &quot;'&quot; , &quot;, function() { M.util.js_complete(&quot;init&quot;);  M.util.js_complete(&quot; , &quot;'&quot; , &quot;random67dd1cac9c7485&quot; , &quot;'&quot; , &quot;); });
})();
//]]&gt;



    



&quot;) or . = concat(&quot;



    
    Skip to main content




//&lt;![CDATA[
document.body.className += &quot; , &quot;'&quot; , &quot; jsenabled&quot; , &quot;'&quot; , &quot;;
//]]&gt;




        
        
            
            
            
                
                    
                        
                            
                                    
                            
                            
                            
                                Login Into your account to continue with your learning experience.  
                            

                                
                                    Skip to create new account
                                

                            
                                
                                    
                                        
                                            
                                            
                                            document.getElementById(&quot; , &quot;'&quot; , &quot;anchor&quot; , &quot;'&quot; , &quot;).value = location.hash;
                                            Username
                                            
                                                
                                                
                                                
                                                        Username
                                                
                                                
                                                
                                            
                                            Password
                                            Forgot your password?
                                            
                                            
                                                
                                                Password
                                                
                                                
                                                
                                                
                                            
                                            
                                            
                                             
    
        
        
        English ‎(en)‎     
    
    
                English ‎(en)‎
                Español - Internacional ‎(es)‎
                Japanese ‎(ja_kids)‎
                हिंदी ‎(hi)‎
                日本語 ‎(ja)‎
    

                                            
                                                
                                                    
                                                    Keep me logged in
                                                
                                            
                                            
                                            Log in
                                            
                                        
                                    
                                    
                                
                                
                                    
                                        Or you can join with
                                        
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                                
                                                    
                                                            
                                                    
                                                
                                        
                                    
                                    
                                                       
                            
                                    
                                        Don’t have an  account? Create An Account   
                                    
                        
                    
                
            
        
                
                Powered by ParadisoLMS
                
            
        
    




    

        
        
            
                    
                        Powered by Paradiso LMS 
                    
            
        
        
//&lt;![CDATA[
var require = {
    baseUrl : &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/requirejs.php/1742541316/&quot; , &quot;'&quot; , &quot;,
    // We only support AMD modules with an explicit define() statement.
    enforceDefine: true,
    skipDataMain: true,
    waitSeconds : 0,

    paths: {
      jquery: &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/jquery/jquery-3.6.4.min&quot; , &quot;'&quot; , &quot;,
      jqueryui: &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/jquery/ui-1.13.2/jquery-ui.min&quot; , &quot;'&quot; , &quot;,
      jqueryprivate: &quot; , &quot;'&quot; , &quot;https://plms-php81.paradisolms.net/lib/javascript.php/1742541316/lib/requirejs/jquery-private&quot; , &quot;'&quot; , &quot;
    },

    // Custom jquery config map.
    map: {
      // &quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot; means all modules will get &quot; , &quot;'&quot; , &quot;jqueryprivate&quot; , &quot;'&quot; , &quot;
      // for their &quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot; dependency.
      &quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot;: { jquery: &quot; , &quot;'&quot; , &quot;jqueryprivate&quot; , &quot;'&quot; , &quot; },
      // Stub module for &quot; , &quot;'&quot; , &quot;process&quot; , &quot;'&quot; , &quot;. This is a workaround for a bug in MathJax (see MDL-60458).
      &quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot;: { process: &quot; , &quot;'&quot; , &quot;core/first&quot; , &quot;'&quot; , &quot; },

      // &quot; , &quot;'&quot; , &quot;jquery-private&quot; , &quot;'&quot; , &quot; wants the real jQuery module
      // though. If this line was not here, there would
      // be an unresolvable cyclic dependency.
      jqueryprivate: { jquery: &quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot; }
    }
};

//]]&gt;



//&lt;![CDATA[
M.util.js_pending(&quot;core/first&quot;);require([&quot; , &quot;'&quot; , &quot;core/first&quot; , &quot;'&quot; , &quot;], function() {
require([&quot; , &quot;'&quot; , &quot;core/prefetch&quot; , &quot;'&quot; , &quot;]);
;
require([&quot;media_videojs/loader&quot;], function(loader) {
    loader.setUp(function(videojs) {
        videojs.options.flash.swf = &quot;https://plms-php81.paradisolms.net/media/player/videojs/videojs/video-js.swf&quot;;
videojs.addLanguage(&quot; , &quot;'&quot; , &quot;en&quot; , &quot;'&quot; , &quot;, {
  &quot;Audio Player&quot;: &quot;Audio Player&quot;,
  &quot;Video Player&quot;: &quot;Video Player&quot;,
  &quot;Play&quot;: &quot;Play&quot;,
  &quot;Pause&quot;: &quot;Pause&quot;,
  &quot;Replay&quot;: &quot;Replay&quot;,
  &quot;Current Time&quot;: &quot;Current Time&quot;,
  &quot;Duration&quot;: &quot;Duration&quot;,
  &quot;Remaining Time&quot;: &quot;Remaining Time&quot;,
  &quot;Stream Type&quot;: &quot;Stream Type&quot;,
  &quot;LIVE&quot;: &quot;LIVE&quot;,
  &quot;Seek to live, currently behind live&quot;: &quot;Seek to live, currently behind live&quot;,
  &quot;Seek to live, currently playing live&quot;: &quot;Seek to live, currently playing live&quot;,
  &quot;Loaded&quot;: &quot;Loaded&quot;,
  &quot;Progress&quot;: &quot;Progress&quot;,
  &quot;Progress Bar&quot;: &quot;Progress Bar&quot;,
  &quot;progress bar timing: currentTime={1} duration={2}&quot;: &quot;{1} of {2}&quot;,
  &quot;Fullscreen&quot;: &quot;Fullscreen&quot;,
  &quot;Non-Fullscreen&quot;: &quot;Non-Fullscreen&quot;,
  &quot;Mute&quot;: &quot;Mute&quot;,
  &quot;Unmute&quot;: &quot;Unmute&quot;,
  &quot;Playback Rate&quot;: &quot;Playback Rate&quot;,
  &quot;Subtitles&quot;: &quot;Subtitles&quot;,
  &quot;subtitles off&quot;: &quot;subtitles off&quot;,
  &quot;Captions&quot;: &quot;Captions&quot;,
  &quot;captions off&quot;: &quot;captions off&quot;,
  &quot;Chapters&quot;: &quot;Chapters&quot;,
  &quot;Descriptions&quot;: &quot;Descriptions&quot;,
  &quot;descriptions off&quot;: &quot;descriptions off&quot;,
  &quot;Audio Track&quot;: &quot;Audio Track&quot;,
  &quot;Volume Level&quot;: &quot;Volume Level&quot;,
  &quot;You aborted the media playback&quot;: &quot;You aborted the media playback&quot;,
  &quot;A network error caused the media download to fail part-way.&quot;: &quot;A network error caused the media download to fail part-way.&quot;,
  &quot;The media could not be loaded, either because the server or network failed or because the format is not supported.&quot;: &quot;The media could not be loaded, either because the server or network failed or because the format is not supported.&quot;,
  &quot;The media playback was aborted due to a corruption problem or because the media used features your browser did not support.&quot;: &quot;The media playback was aborted due to a corruption problem or because the media used features your browser did not support.&quot;,
  &quot;No compatible source was found for this media.&quot;: &quot;No compatible source was found for this media.&quot;,
  &quot;The media is encrypted and we do not have the keys to decrypt it.&quot;: &quot;The media is encrypted and we do not have the keys to decrypt it.&quot;,
  &quot;Play Video&quot;: &quot;Play Video&quot;,
  &quot;Close&quot;: &quot;Close&quot;,
  &quot;Close Modal Dialog&quot;: &quot;Close Modal Dialog&quot;,
  &quot;Modal Window&quot;: &quot;Modal Window&quot;,
  &quot;This is a modal window&quot;: &quot;This is a modal window&quot;,
  &quot;This modal can be closed by pressing the Escape key or activating the close button.&quot;: &quot;This modal can be closed by pressing the Escape key or activating the close button.&quot;,
  &quot;, opens captions settings dialog&quot;: &quot;, opens captions settings dialog&quot;,
  &quot;, opens subtitles settings dialog&quot;: &quot;, opens subtitles settings dialog&quot;,
  &quot;, opens descriptions settings dialog&quot;: &quot;, opens descriptions settings dialog&quot;,
  &quot;, selected&quot;: &quot;, selected&quot;,
  &quot;captions settings&quot;: &quot;captions settings&quot;,
  &quot;subtitles settings&quot;: &quot;subtitles settings&quot;,
  &quot;descriptions settings&quot;: &quot;descriptions settings&quot;,
  &quot;Text&quot;: &quot;Text&quot;,
  &quot;White&quot;: &quot;White&quot;,
  &quot;Black&quot;: &quot;Black&quot;,
  &quot;Red&quot;: &quot;Red&quot;,
  &quot;Green&quot;: &quot;Green&quot;,
  &quot;Blue&quot;: &quot;Blue&quot;,
  &quot;Yellow&quot;: &quot;Yellow&quot;,
  &quot;Magenta&quot;: &quot;Magenta&quot;,
  &quot;Cyan&quot;: &quot;Cyan&quot;,
  &quot;Background&quot;: &quot;Background&quot;,
  &quot;Window&quot;: &quot;Window&quot;,
  &quot;Transparent&quot;: &quot;Transparent&quot;,
  &quot;Semi-Transparent&quot;: &quot;Semi-Transparent&quot;,
  &quot;Opaque&quot;: &quot;Opaque&quot;,
  &quot;Font Size&quot;: &quot;Font Size&quot;,
  &quot;Text Edge Style&quot;: &quot;Text Edge Style&quot;,
  &quot;None&quot;: &quot;None&quot;,
  &quot;Raised&quot;: &quot;Raised&quot;,
  &quot;Depressed&quot;: &quot;Depressed&quot;,
  &quot;Uniform&quot;: &quot;Uniform&quot;,
  &quot;Dropshadow&quot;: &quot;Dropshadow&quot;,
  &quot;Font Family&quot;: &quot;Font Family&quot;,
  &quot;Proportional Sans-Serif&quot;: &quot;Proportional Sans-Serif&quot;,
  &quot;Monospace Sans-Serif&quot;: &quot;Monospace Sans-Serif&quot;,
  &quot;Proportional Serif&quot;: &quot;Proportional Serif&quot;,
  &quot;Monospace Serif&quot;: &quot;Monospace Serif&quot;,
  &quot;Casual&quot;: &quot;Casual&quot;,
  &quot;Script&quot;: &quot;Script&quot;,
  &quot;Small Caps&quot;: &quot;Small Caps&quot;,
  &quot;Reset&quot;: &quot;Reset&quot;,
  &quot;restore all settings to the default values&quot;: &quot;restore all settings to the default values&quot;,
  &quot;Done&quot;: &quot;Done&quot;,
  &quot;Caption Settings Dialog&quot;: &quot;Caption Settings Dialog&quot;,
  &quot;Beginning of dialog window. Escape will cancel and close the window.&quot;: &quot;Beginning of dialog window. Escape will cancel and close the window.&quot;,
  &quot;End of dialog window.&quot;: &quot;End of dialog window.&quot;,
  &quot;{1} is loading.&quot;: &quot;{1} is loading.&quot;,
  &quot;Exit Picture-in-Picture&quot;: &quot;Exit Picture-in-Picture&quot;,
  &quot;Picture-in-Picture&quot;: &quot;Picture-in-Picture&quot;
});

    });
});;


require([&quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;tool_policy/jquery-eu-cookie-law-popup&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;tool_policy/policyactions&quot; , &quot;'&quot; , &quot;], function($, Popup, ActionsMod) {
        // Initialise the guest popup.
        $(document).ready(function() {
            // Only show message if there is some policy related to guests.

            // Initialise the JS for the modal window which displays the policy versions.
            ActionsMod.init(&quot; , &quot;'&quot; , &quot;[data-action=&quot;view-guest&quot;]&quot; , &quot;'&quot; , &quot;);
        });
});

;

require([&quot; , &quot;'&quot; , &quot;theme_boost/loader&quot; , &quot;'&quot; , &quot;]);
;

require([&quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;core/custom_interaction_events&quot; , &quot;'&quot; , &quot;], function($, CustomEvents) {
    CustomEvents.define(&quot; , &quot;'&quot; , &quot;#single_select67dd1cac9c7483&quot; , &quot;'&quot; , &quot;, [CustomEvents.events.accessibleChange]);
    $(&quot; , &quot;'&quot; , &quot;#single_select67dd1cac9c7483&quot; , &quot;'&quot; , &quot;).on(CustomEvents.events.accessibleChange, function() {
        var ignore = $(this).find(&quot; , &quot;'&quot; , &quot;:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;data-ignore&quot; , &quot;'&quot; , &quot;);
        if (typeof ignore === typeof undefined) {
            $(&quot; , &quot;'&quot; , &quot;#single_select_f67dd1cac9c7482&quot; , &quot;'&quot; , &quot;).submit();
        }
    });
});
;


        require([&quot; , &quot;'&quot; , &quot;core_form/passwordunmask&quot; , &quot;'&quot; , &quot;], function(PasswordUnmask) {
    new PasswordUnmask(&quot;&quot;);
});

$(&quot; , &quot;'&quot; , &quot;#passwordunmask&quot; , &quot;'&quot; , &quot;).click(function(){
    var typeval = $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;);
    if(typeval==&quot;text&quot;) {
        $(&quot;.fa-eye&quot;).removeClass(&quot;fa-eye-slash&quot;);
        $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).removeAttr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;);
        $(&quot; , &quot;'&quot; , &quot;#eyeid&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;title&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;Show&quot; , &quot;'&quot; , &quot;);
    } else {
        $(&quot;.fa-eye&quot;).addClass(&quot;fa-eye-slash&quot;);
        $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).removeAttr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;);
        $(&quot; , &quot;'&quot; , &quot;#eyeid&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;title&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;Hide&quot; , &quot;'&quot; , &quot;);
    }
    $(&quot; , &quot;'&quot; , &quot;#password&quot; , &quot;'&quot; , &quot;).focus();
});

    ;
M.util.js_pending(&quot; , &quot;'&quot; , &quot;core/notification&quot; , &quot;'&quot; , &quot;); require([&quot; , &quot;'&quot; , &quot;core/notification&quot; , &quot;'&quot; , &quot;], function(amd) {amd.init(1, [], false); M.util.js_complete(&quot; , &quot;'&quot; , &quot;core/notification&quot; , &quot;'&quot; , &quot;);});;
M.util.js_pending(&quot; , &quot;'&quot; , &quot;core/log&quot; , &quot;'&quot; , &quot;); require([&quot; , &quot;'&quot; , &quot;core/log&quot; , &quot;'&quot; , &quot;], function(amd) {amd.setConfig({&quot;level&quot;:&quot;warn&quot;}); M.util.js_complete(&quot; , &quot;'&quot; , &quot;core/log&quot; , &quot;'&quot; , &quot;);});;
M.util.js_pending(&quot; , &quot;'&quot; , &quot;core/page_global&quot; , &quot;'&quot; , &quot;); require([&quot; , &quot;'&quot; , &quot;core/page_global&quot; , &quot;'&quot; , &quot;], function(amd) {amd.init(); M.util.js_complete(&quot; , &quot;'&quot; , &quot;core/page_global&quot; , &quot;'&quot; , &quot;);});M.util.js_complete(&quot;core/first&quot;);
});
//]]&gt;




//&lt;![CDATA[
M.str = {&quot;moodle&quot;:{&quot;lastmodified&quot;:&quot;Last modified&quot;,&quot;name&quot;:&quot;Name&quot;,&quot;error&quot;:&quot;Error&quot;,&quot;info&quot;:&quot;Information&quot;,&quot;yes&quot;:&quot;Yes&quot;,&quot;no&quot;:&quot;No&quot;,&quot;cancel&quot;:&quot;Cancel&quot;,&quot;confirm&quot;:&quot;Confirm&quot;,&quot;areyousure&quot;:&quot;Are you sure?&quot;,&quot;closebuttontitle&quot;:&quot;Close&quot;,&quot;unknownerror&quot;:&quot;Unknown error&quot;,&quot;file&quot;:&quot;File&quot;,&quot;url&quot;:&quot;URL&quot;},&quot;repository&quot;:{&quot;type&quot;:&quot;Type&quot;,&quot;size&quot;:&quot;Size&quot;,&quot;invalidjson&quot;:&quot;Invalid JSON string&quot;,&quot;nofilesattached&quot;:&quot;No files attached&quot;,&quot;filepicker&quot;:&quot;File picker&quot;,&quot;logout&quot;:&quot;Logout&quot;,&quot;nofilesavailable&quot;:&quot;No files available&quot;,&quot;norepositoriesavailable&quot;:&quot;Sorry, none of your current repositories can return files in the required format.&quot;,&quot;fileexistsdialogheader&quot;:&quot;File exists&quot;,&quot;fileexistsdialog_editor&quot;:&quot;A file with that name has already been attached to the text you are editing.&quot;,&quot;fileexistsdialog_filemanager&quot;:&quot;A file with that name has already been attached&quot;,&quot;renameto&quot;:&quot;Rename to \&quot;{$a}\&quot;&quot;,&quot;referencesexist&quot;:&quot;There are {$a} alias\/shortcut files that use this file as their source&quot;,&quot;select&quot;:&quot;Select&quot;},&quot;admin&quot;:{&quot;confirmdeletecomments&quot;:&quot;You are about to delete comments, are you sure?&quot;,&quot;confirmation&quot;:&quot;Confirmation&quot;},&quot;debug&quot;:{&quot;debuginfo&quot;:&quot;Debug info&quot;,&quot;line&quot;:&quot;Line&quot;,&quot;stacktrace&quot;:&quot;Stack trace&quot;},&quot;langconfig&quot;:{&quot;labelsep&quot;:&quot;: &quot;}};
//]]&gt;


//&lt;![CDATA[
(function() {M.util.help_popups.setup(Y);
 M.util.js_pending(&quot; , &quot;'&quot; , &quot;random67dd1cac9c7485&quot; , &quot;'&quot; , &quot;); Y.on(&quot; , &quot;'&quot; , &quot;domready&quot; , &quot;'&quot; , &quot;, function() { M.util.js_complete(&quot;init&quot;);  M.util.js_complete(&quot; , &quot;'&quot; , &quot;random67dd1cac9c7485&quot; , &quot;'&quot; , &quot;); });
})();
//]]&gt;



    



&quot;))]</value>
      <webElementGuid>924f8659-1f08-4426-936d-c8efef06a697</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
