<?php

use Twig\Environment;
use Twig\Error\LoaderError;
use Twig\Error\RuntimeError;
use Twig\Extension\SandboxExtension;
use Twig\Markup;
use Twig\Sandbox\SecurityError;
use Twig\Sandbox\SecurityNotAllowedTagError;
use Twig\Sandbox\SecurityNotAllowedFilterError;
use Twig\Sandbox\SecurityNotAllowedFunctionError;
use Twig\Source;
use Twig\Template;

/* C:\wamp64\www\kaleidoscope\install-master/themes/demo/partials/site/footer.htm */
class __TwigTemplate_6cbaed5d1ead096c160aa0e7abfb9faba6b75ee52dfd1ae1a702790b6d888a3b extends \Twig\Template
{
    private $source;

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->parent = false;

        $this->blocks = [
        ];
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        // line 1
        echo "<div id=\"footer\">
    <div class=\"container\">
        <hr />
        <p class=\"muted credit\">&copy; 2013 - ";
        // line 4
        echo twig_escape_filter($this->env, twig_date_format_filter($this->env, "now", "Y"), "html", null, true);
        echo " Alexey Bobkov &amp; Samuel Georges.</p>
    </div>
</div>

<!-- #main -->
<footer id=\"wide-footer\">
<div class=\"container\">
<div class=\"row\">
<script type=\"text/javascript\">
//<![CDATA[
if (typeof newsletter_check !== \"function\") {
window.newsletter_check = function (f) {
    var re = /^([a-zA-Z0-9_\\.\\-\\+])+\\@(([a-zA-Z0-9\\-]{1,})+\\.)+([a-zA-Z0-9]{2,})+\$/;
    if (!re.test(f.elements[\"ne\"].value)) {
        alert(\"The email is not correct\");
        return false;
    }
    for (var i=1; i<20; i++) {
    if (f.elements[\"np\" + i] && f.elements[\"np\" + i].required && f.elements[\"np\" + i].value == \"\") {
        alert(\"\");
        return false;
    }
    }
    if (f.elements[\"ny\"] && !f.elements[\"ny\"].checked) {
        alert(\"You must accept the privacy statement\");
        return false;
    }
    return true;
}
}
//]]>
\t\t\t</script>
<!-- <div class=\"newsletter newsletter-subscription\">
\t\t\t\t<form method=\"post\" action=\"http://localhost/liberty/?na=s\" onsubmit=\"return newsletter_check(this)\">
\t\t\t\t\t<div class=\"col-xs-12 col-md-2 hidden-md hidden-lg\">
\t\t\t\t\t\tContact Us<br>
\t\t\t\t\t\t<br>
\t\t\t\t\t</div>
\t\t\t\t\t<div class=\"col-xs-12 col-md-4 form-group has-feedback\">
\t\t\t\t\t\t<input class=\"newsletter-firstname\" type=\"text\" name=\"nn\" placeholder=\"Your Name\">
\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user form-control-feedback\"></span>
\t\t\t\t\t</div>
\t\t\t\t\t<div class=\"col-xs-12 col-md-4 form-group has-feedback\">
\t\t\t\t\t\t<input class=\"newsletter-email\" type=\"email\" name=\"ne\" required placeholder=\"Your Email\">
\t\t\t\t\t\t<span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>
\t\t\t\t\t</div>
\t\t\t\t\t<div class=\"col-xs-12 col-md-2\">
\t\t\t\t\t\t<input class=\"newsletter-submit btn\" type=\"submit\" value=\"Subscribe\"/>
\t\t\t\t\t</div>
\t\t\t\t</form>
\t\t\t</div> -->
<div id=\"scf-form-contactForm\">
<form method=\"POST\" action=\"http://tulf.org/tulf.org/cms/contact-us\" accept-charset=\"UTF-8\" role=\"form\" data-request=\"contactForm::onFormSend\" data-request-update=\"&#039;contactForm::scf-message&#039;:&#039;#scf-message-contactForm&#039;,&#039;contactForm::scf-form&#039;:&#039;#scf-form-contactForm&#039;\">
\t<div class=\"form-group\">
\t\t Contact Us <input name=\"_handler\" type=\"hidden\" value=\"contactForm::onFormSend\"><input name=\"_session_key\" type=\"hidden\" value=\"kmZ0yXPlMusqHi2ipDzI7sSWixkPnFTG8GrApaUv\"><input name=\"_token\" type=\"hidden\" value=\"PtaytqgjTAIXQ4mgACDDwcJsTfQgbsFql9XAvMhR\">
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Email\">Name</label>
\t\t<input id=\"contactForm-Name\" name=\"Name\" class=\"form-control\" type=\"text\">
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Email\">Email</label><input id=\"contactForm-Email\" name=\"Email\" class=\"form-control\" type=\"text\">
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Query\">Query</label><textarea id=\"contactForm-Query\" name=\"Query\" class=\"form-control\" rows=\"5\"></textarea>
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Phone\">Phone</label><input id=\"contactForm-Phone\" name=\"Phone\" class=\"form-control\" type=\"text\">
\t</div>
\t<div id=\"submit-wrapper-contactForm\" class=\"form-group\">
\t\t<button type=\"submit\" data-attach-loading class=\"oc-loader btn btn-primary\">Send</button>
\t</div>
</form>
</div>
</div>
</div>
</footer>
<footer id=\"main-footer\" class=\"site-footer\">
<div class=\"container\">
<div class=\"row\">
<div class=\" col-sm-4 col-xs-12 \">
<aside id=\"dpe_fp_widget-3\" class=\"widget widget_dpe_fp_widget\">
<h3 class=\"widget-title\">Latest Posts</h3>
<div class=\"upw-posts hfeed tb\">
\t<article class=\"post-217 post type-post status-publish format-standard has-post-thumbnail hentry category-elections category-government\">
\t<div class=\"entry-image tbWow fadeIn hidden-xs hidden-sm\" data-wow-delay=\"0.3s\" data-wow-duration=\"0.8s\">
\t\t<a href=\"#2015/07/22/presidential-elections-2016/\" rel=\"bookmark\">
\t\t<img width=\"150\" height=\"150\" src=\"themes/demo/assets/images/news_1_party-150x150.jpg\" class=\"img-circle wp-post-image\" alt=\"\" srcset=\"themes/demo/assets/images/news_1_party-150x150.jpg 150w, themes/demo/assets/images/news_1_party-600x300_1.jpg 300w, themes/demo/assets/images/news_1_party-600x300_1.jpg 600w\" sizes=\"(max-width: 150px) 100vw, 150px\"/></a>
\t</div>
\t<div class=\"upw-content \">
\t\t<h4 class=\"entry-title tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t<a href=\"#2015/07/22/presidential-elections-2016/\" rel=\"bookmark\">
\t\tTULF Founded in 1972 </a>
\t\t</h4>
\t\t<div class=\"entry-summary tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t\t<p>
\t\t\t\t This year, in this election, we are called to reaffirm our values and our commitments,&hellip;
\t\t\t</p>
\t\t</div>
\t</div>
\t</article>
\t<article class=\"post-210 post type-post status-publish format-standard has-post-thumbnail hentry category-government category-senate\">
\t<div class=\"entry-image tbWow fadeIn hidden-xs hidden-sm\" data-wow-delay=\"0.3s\" data-wow-duration=\"0.8s\">
\t\t<a href=\"#2015/04/05/senate-confirms-judicial-nominees/\" rel=\"bookmark\">
\t\t<img width=\"150\" height=\"150\" src=\"themes/demo/assets/images/news_2_amirthalingam-150x150.jpg\" class=\"img-circle wp-post-image\" alt=\"\" srcset=\"themes/demo/assets/images/news_2_amirthalingam-150x150.jpg 150w, themes/demo/assets/images/news_2_amirthalingam-600x300_1.jpg 300w, themes/demo/assets/images/news_2_amirthalingam-600x300_1.jpg 600w\" sizes=\"(max-width: 150px) 100vw, 150px\"/></a>
\t</div>
\t<div class=\"upw-content \">
\t\t<h4 class=\"entry-title tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t<a href=\"#2015/04/05/senate-confirms-judicial-nominees/\" rel=\"bookmark\">
\t\tMain opposition Party in Srilanka </a>
\t\t</h4>
\t\t<div class=\"entry-summary tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t\t<p>
\t\t\t\t The Senate unanimously confirmed four of 38 pending judicial nominations Thursday evening, the first of&hellip;
\t\t\t</p>
\t\t</div>
\t</div>
\t</article>
\t<article class=\"post-207 post type-post status-publish format-standard has-post-thumbnail hentry category-congress category-government\">
\t<div class=\"entry-image tbWow fadeIn hidden-xs hidden-sm\" data-wow-delay=\"0.3s\" data-wow-duration=\"0.8s\">
\t\t<a href=\"#2015/03/22/cutting-risk-by-disclosing-political-donations/\" rel=\"bookmark\">
\t\t<img width=\"150\" height=\"150\" src=\"themes/demo/assets/images/news_3_dem_slow-150x150.jpg\" class=\"img-circle wp-post-image\" alt=\"\" srcset=\"themes/demo/assets/images/news_3_dem_slow-150x150.jpg 150w, themes/demo/assets/images/news_3_dem_slow-600x300_1.jpg 300w, themes/demo/assets/images/news_3_dem_slow-600x600.jpg 600w\" sizes=\"(max-width: 150px) 100vw, 150px\"/></a>
\t</div>
\t<div class=\"upw-content \">
\t\t<h4 class=\"entry-title tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t<a href=\"#2015/03/22/cutting-risk-by-disclosing-political-donations/\" rel=\"bookmark\">
\t\tTamil Democratic Movement Slowdown </a>
\t\t</h4>
\t\t<div class=\"entry-summary tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t\t<p>
\t\t\t\t In politics, it often pays to be ahead of the curve. That holds true for&hellip;
\t\t\t</p>
\t\t</div>
\t</div>
\t</article>
</div>
</aside>
</div>
<div class=\" col-sm-4 col-xs-12\" id=\"twitter-widget\">
<a class=\"twitter-timeline\" href=\"https://twitter.com/SriLanka?ref_src=twsrc%5Etfw\" data-chrome=\"transparent noheader nofooter noborders\" data-tweet-limit=\"3\">Tweets by SriLanka</a>
<script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>
</div>
<!--
\t\t\t<script src=\"//www.powr.io/powr.js?external-type=html\"></script>
\t\t\t<div class=\"powr-media-gallery\" id=\"e915b1de_1553538332\"></div>
    -->
<div class=\" col-sm-4 col-xs-12 \" style=\"display:none;\">
<aside id=\"twitter-2\" class=\"widget_twitter_tweets widget widget_twitter\">
<h3 class=\"widget_twitter_tweets widget-title\">Latest Tweets</h3>
<div class=\"wrap-twitter\">
\t<ul>
\t\t<li>
\t\t<div class=\"absolutecenter-stretch\">
\t\t\t<div class=\"hidden-xs hidden-sm tweet_avatar tweet_avatar_normal tbWow fadeIn\">
\t\t\t\t<a class=\"hidden-xs hidden-sm\" href=\"https://twitter.com/theme_blossom\"><img alt=\"theme_blossom on Twitter\" src=\"http://pbs.twimg.com/profile_images/915181647938691072/dX17rt_D_normal.jpg\" class=\"img-circle\"></a>
\t\t\t</div>
\t\t\t<div>
\t\t\t\t<div class=\"tweet_data tbWow fadeIn\">
\t\t\t\t\t RT <a href=\"http://twitter.com/elegantthemes\" title=\"Follow elegantthemes\" target=\"_blank\">@elegantthemes</a>: How to Integrate WhatsApp into Your WordPress Website <a href=\"https://t.co/D4VOasWCDO\">https://t.co/D4VOasWCDO</a>
\t\t\t\t</div>
\t\t\t\t<div class=\"tweet_time tbWow fadeIn\">
\t\t\t\t\t 1 year ago
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t\t</li>
\t\t<li>
\t\t<div class=\"absolutecenter-stretch\">
\t\t\t<div class=\"hidden-xs hidden-sm tweet_avatar tweet_avatar_normal tbWow fadeIn\">
\t\t\t\t<a class=\"hidden-xs hidden-sm\" href=\"https://twitter.com/theme_blossom\"><img alt=\"theme_blossom on Twitter\" src=\"http://pbs.twimg.com/profile_images/915181647938691072/dX17rt_D_normal.jpg\" class=\"img-circle\"></a>
\t\t\t</div>
\t\t\t<div>
\t\t\t\t<div class=\"tweet_data tbWow fadeIn\">
\t\t\t\t\t Claim your WCEU ticket now <a href=\"https://t.co/xtijZJJ2eY\">https://t.co/xtijZJJ2eY</a>
\t\t\t\t</div>
\t\t\t\t<div class=\"tweet_time tbWow fadeIn\">
\t\t\t\t\t 1 year ago
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t\t</li>
\t\t<li>
\t\t<div class=\"absolutecenter-stretch\">
\t\t\t<div class=\"hidden-xs hidden-sm tweet_avatar tweet_avatar_normal tbWow fadeIn\">
\t\t\t\t<a class=\"hidden-xs hidden-sm\" href=\"https://twitter.com/theme_blossom\"><img alt=\"theme_blossom on Twitter\" src=\"http://pbs.twimg.com/profile_images/915181647938691072/dX17rt_D_normal.jpg\" class=\"img-circle\"></a>
\t\t\t</div>
\t\t\t<div>
\t\t\t\t<div class=\"tweet_data tbWow fadeIn\">
\t\t\t\t\t RT <a href=\"http://twitter.com/wpbeginner\" title=\"Follow wpbeginner\" target=\"_blank\">@wpbeginner</a>: How to Remove Date and Time from <a href=\"https://twitter.com/search?q=%23WordPress\" title=\"Search #WordPress\" target=\"_blank\">#WordPress</a> Comments - <a href=\"https://t.co/l4XJ1ehuSr\">https://t.co/l4XJ1ehuSr</a><a href=\"https://t.co/bFFyZrTB1D\">https://t.co/bFFyZrTB1D</a>
\t\t\t\t</div>
\t\t\t\t<div class=\"tweet_time tbWow fadeIn\">
\t\t\t\t\t 1 year ago
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t\t</li>
\t</ul>
</div>
</aside>
</div>
<div class=\" col-sm-4 col-xs-12 \">
<iframe src=\"http://www.youtube.com/embed/?listType=user_uploads&list=zeenews\" width=\"480\" height=\"400\">
</iframe>
</div>
</div>
</div>
<div class=\" col-sm-12 col-xs-12 \">
<aside id=\"text-2\" class=\"widget widget_text\">
<h3 class=\"widget-title\">About</h3>
<div class=\"textwidget\">
<p>
 Be a part of the movement and participate in building a better future for our country! Join this historical campaign and stand up for the values that make our country great. Make a difference.
</p>
<p>
<strong>The Campaign is paid for By the people for TULF</strong>
</p>
</div>
</aside><aside id=\"woocommerce_products-3\" class=\"widget woocommerce widget_products\">
</aside>
</div>
<div id=\"footer-navigation\">
<div class=\"container\">
<div class=\"row\">
<div class=\"disclaimer-area col-sm-6\">
\t<nav>
\t<div class=\"menu-footer-container\">
\t</div>
\t</nav>
\t<div class=\"clear\">
\t</div>
\t<div class=\"clear\">
\t\t<div class=\"fw-page-builder-content\">
\t\t\t<p>
\t\t\t\t<i class=\"fa fa-copyright\"></i> Copyright - Tulf - All rights reserved . Powered by <i class=\"fa fa-reply-all\"></i>
\t\t\t\t<a href=\"mailto:rambhuchas@gmail.com?Subject=Web%20Inquiry\" target=\"_top\">Rambhuchas</a>
\t\t\t</p>
\t\t</div>
\t</div>
</div>
</div>
</div>
</div>
</footer>";
    }

    public function getTemplateName()
    {
        return "C:\\wamp64\\www\\kaleidoscope\\install-master/themes/demo/partials/site/footer.htm";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  40 => 4,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("<div id=\"footer\">
    <div class=\"container\">
        <hr />
        <p class=\"muted credit\">&copy; 2013 - {{ \"now\"|date(\"Y\") }} Alexey Bobkov &amp; Samuel Georges.</p>
    </div>
</div>

<!-- #main -->
<footer id=\"wide-footer\">
<div class=\"container\">
<div class=\"row\">
<script type=\"text/javascript\">
//<![CDATA[
if (typeof newsletter_check !== \"function\") {
window.newsletter_check = function (f) {
    var re = /^([a-zA-Z0-9_\\.\\-\\+])+\\@(([a-zA-Z0-9\\-]{1,})+\\.)+([a-zA-Z0-9]{2,})+\$/;
    if (!re.test(f.elements[\"ne\"].value)) {
        alert(\"The email is not correct\");
        return false;
    }
    for (var i=1; i<20; i++) {
    if (f.elements[\"np\" + i] && f.elements[\"np\" + i].required && f.elements[\"np\" + i].value == \"\") {
        alert(\"\");
        return false;
    }
    }
    if (f.elements[\"ny\"] && !f.elements[\"ny\"].checked) {
        alert(\"You must accept the privacy statement\");
        return false;
    }
    return true;
}
}
//]]>
\t\t\t</script>
<!-- <div class=\"newsletter newsletter-subscription\">
\t\t\t\t<form method=\"post\" action=\"http://localhost/liberty/?na=s\" onsubmit=\"return newsletter_check(this)\">
\t\t\t\t\t<div class=\"col-xs-12 col-md-2 hidden-md hidden-lg\">
\t\t\t\t\t\tContact Us<br>
\t\t\t\t\t\t<br>
\t\t\t\t\t</div>
\t\t\t\t\t<div class=\"col-xs-12 col-md-4 form-group has-feedback\">
\t\t\t\t\t\t<input class=\"newsletter-firstname\" type=\"text\" name=\"nn\" placeholder=\"Your Name\">
\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user form-control-feedback\"></span>
\t\t\t\t\t</div>
\t\t\t\t\t<div class=\"col-xs-12 col-md-4 form-group has-feedback\">
\t\t\t\t\t\t<input class=\"newsletter-email\" type=\"email\" name=\"ne\" required placeholder=\"Your Email\">
\t\t\t\t\t\t<span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>
\t\t\t\t\t</div>
\t\t\t\t\t<div class=\"col-xs-12 col-md-2\">
\t\t\t\t\t\t<input class=\"newsletter-submit btn\" type=\"submit\" value=\"Subscribe\"/>
\t\t\t\t\t</div>
\t\t\t\t</form>
\t\t\t</div> -->
<div id=\"scf-form-contactForm\">
<form method=\"POST\" action=\"http://tulf.org/tulf.org/cms/contact-us\" accept-charset=\"UTF-8\" role=\"form\" data-request=\"contactForm::onFormSend\" data-request-update=\"&#039;contactForm::scf-message&#039;:&#039;#scf-message-contactForm&#039;,&#039;contactForm::scf-form&#039;:&#039;#scf-form-contactForm&#039;\">
\t<div class=\"form-group\">
\t\t Contact Us <input name=\"_handler\" type=\"hidden\" value=\"contactForm::onFormSend\"><input name=\"_session_key\" type=\"hidden\" value=\"kmZ0yXPlMusqHi2ipDzI7sSWixkPnFTG8GrApaUv\"><input name=\"_token\" type=\"hidden\" value=\"PtaytqgjTAIXQ4mgACDDwcJsTfQgbsFql9XAvMhR\">
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Email\">Name</label>
\t\t<input id=\"contactForm-Name\" name=\"Name\" class=\"form-control\" type=\"text\">
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Email\">Email</label><input id=\"contactForm-Email\" name=\"Email\" class=\"form-control\" type=\"text\">
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Query\">Query</label><textarea id=\"contactForm-Query\" name=\"Query\" class=\"form-control\" rows=\"5\"></textarea>
\t</div>
\t<div class=\"form-group\">
\t\t<label class=\"control-label \" for=\"contactForm-Phone\">Phone</label><input id=\"contactForm-Phone\" name=\"Phone\" class=\"form-control\" type=\"text\">
\t</div>
\t<div id=\"submit-wrapper-contactForm\" class=\"form-group\">
\t\t<button type=\"submit\" data-attach-loading class=\"oc-loader btn btn-primary\">Send</button>
\t</div>
</form>
</div>
</div>
</div>
</footer>
<footer id=\"main-footer\" class=\"site-footer\">
<div class=\"container\">
<div class=\"row\">
<div class=\" col-sm-4 col-xs-12 \">
<aside id=\"dpe_fp_widget-3\" class=\"widget widget_dpe_fp_widget\">
<h3 class=\"widget-title\">Latest Posts</h3>
<div class=\"upw-posts hfeed tb\">
\t<article class=\"post-217 post type-post status-publish format-standard has-post-thumbnail hentry category-elections category-government\">
\t<div class=\"entry-image tbWow fadeIn hidden-xs hidden-sm\" data-wow-delay=\"0.3s\" data-wow-duration=\"0.8s\">
\t\t<a href=\"#2015/07/22/presidential-elections-2016/\" rel=\"bookmark\">
\t\t<img width=\"150\" height=\"150\" src=\"themes/demo/assets/images/news_1_party-150x150.jpg\" class=\"img-circle wp-post-image\" alt=\"\" srcset=\"themes/demo/assets/images/news_1_party-150x150.jpg 150w, themes/demo/assets/images/news_1_party-600x300_1.jpg 300w, themes/demo/assets/images/news_1_party-600x300_1.jpg 600w\" sizes=\"(max-width: 150px) 100vw, 150px\"/></a>
\t</div>
\t<div class=\"upw-content \">
\t\t<h4 class=\"entry-title tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t<a href=\"#2015/07/22/presidential-elections-2016/\" rel=\"bookmark\">
\t\tTULF Founded in 1972 </a>
\t\t</h4>
\t\t<div class=\"entry-summary tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t\t<p>
\t\t\t\t This year, in this election, we are called to reaffirm our values and our commitments,&hellip;
\t\t\t</p>
\t\t</div>
\t</div>
\t</article>
\t<article class=\"post-210 post type-post status-publish format-standard has-post-thumbnail hentry category-government category-senate\">
\t<div class=\"entry-image tbWow fadeIn hidden-xs hidden-sm\" data-wow-delay=\"0.3s\" data-wow-duration=\"0.8s\">
\t\t<a href=\"#2015/04/05/senate-confirms-judicial-nominees/\" rel=\"bookmark\">
\t\t<img width=\"150\" height=\"150\" src=\"themes/demo/assets/images/news_2_amirthalingam-150x150.jpg\" class=\"img-circle wp-post-image\" alt=\"\" srcset=\"themes/demo/assets/images/news_2_amirthalingam-150x150.jpg 150w, themes/demo/assets/images/news_2_amirthalingam-600x300_1.jpg 300w, themes/demo/assets/images/news_2_amirthalingam-600x300_1.jpg 600w\" sizes=\"(max-width: 150px) 100vw, 150px\"/></a>
\t</div>
\t<div class=\"upw-content \">
\t\t<h4 class=\"entry-title tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t<a href=\"#2015/04/05/senate-confirms-judicial-nominees/\" rel=\"bookmark\">
\t\tMain opposition Party in Srilanka </a>
\t\t</h4>
\t\t<div class=\"entry-summary tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t\t<p>
\t\t\t\t The Senate unanimously confirmed four of 38 pending judicial nominations Thursday evening, the first of&hellip;
\t\t\t</p>
\t\t</div>
\t</div>
\t</article>
\t<article class=\"post-207 post type-post status-publish format-standard has-post-thumbnail hentry category-congress category-government\">
\t<div class=\"entry-image tbWow fadeIn hidden-xs hidden-sm\" data-wow-delay=\"0.3s\" data-wow-duration=\"0.8s\">
\t\t<a href=\"#2015/03/22/cutting-risk-by-disclosing-political-donations/\" rel=\"bookmark\">
\t\t<img width=\"150\" height=\"150\" src=\"themes/demo/assets/images/news_3_dem_slow-150x150.jpg\" class=\"img-circle wp-post-image\" alt=\"\" srcset=\"themes/demo/assets/images/news_3_dem_slow-150x150.jpg 150w, themes/demo/assets/images/news_3_dem_slow-600x300_1.jpg 300w, themes/demo/assets/images/news_3_dem_slow-600x600.jpg 600w\" sizes=\"(max-width: 150px) 100vw, 150px\"/></a>
\t</div>
\t<div class=\"upw-content \">
\t\t<h4 class=\"entry-title tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t<a href=\"#2015/03/22/cutting-risk-by-disclosing-political-donations/\" rel=\"bookmark\">
\t\tTamil Democratic Movement Slowdown </a>
\t\t</h4>
\t\t<div class=\"entry-summary tbWow fadeIn\" data-wow-delay=\"0.1s\">
\t\t\t<p>
\t\t\t\t In politics, it often pays to be ahead of the curve. That holds true for&hellip;
\t\t\t</p>
\t\t</div>
\t</div>
\t</article>
</div>
</aside>
</div>
<div class=\" col-sm-4 col-xs-12\" id=\"twitter-widget\">
<a class=\"twitter-timeline\" href=\"https://twitter.com/SriLanka?ref_src=twsrc%5Etfw\" data-chrome=\"transparent noheader nofooter noborders\" data-tweet-limit=\"3\">Tweets by SriLanka</a>
<script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>
</div>
<!--
\t\t\t<script src=\"//www.powr.io/powr.js?external-type=html\"></script>
\t\t\t<div class=\"powr-media-gallery\" id=\"e915b1de_1553538332\"></div>
    -->
<div class=\" col-sm-4 col-xs-12 \" style=\"display:none;\">
<aside id=\"twitter-2\" class=\"widget_twitter_tweets widget widget_twitter\">
<h3 class=\"widget_twitter_tweets widget-title\">Latest Tweets</h3>
<div class=\"wrap-twitter\">
\t<ul>
\t\t<li>
\t\t<div class=\"absolutecenter-stretch\">
\t\t\t<div class=\"hidden-xs hidden-sm tweet_avatar tweet_avatar_normal tbWow fadeIn\">
\t\t\t\t<a class=\"hidden-xs hidden-sm\" href=\"https://twitter.com/theme_blossom\"><img alt=\"theme_blossom on Twitter\" src=\"http://pbs.twimg.com/profile_images/915181647938691072/dX17rt_D_normal.jpg\" class=\"img-circle\"></a>
\t\t\t</div>
\t\t\t<div>
\t\t\t\t<div class=\"tweet_data tbWow fadeIn\">
\t\t\t\t\t RT <a href=\"http://twitter.com/elegantthemes\" title=\"Follow elegantthemes\" target=\"_blank\">@elegantthemes</a>: How to Integrate WhatsApp into Your WordPress Website <a href=\"https://t.co/D4VOasWCDO\">https://t.co/D4VOasWCDO</a>
\t\t\t\t</div>
\t\t\t\t<div class=\"tweet_time tbWow fadeIn\">
\t\t\t\t\t 1 year ago
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t\t</li>
\t\t<li>
\t\t<div class=\"absolutecenter-stretch\">
\t\t\t<div class=\"hidden-xs hidden-sm tweet_avatar tweet_avatar_normal tbWow fadeIn\">
\t\t\t\t<a class=\"hidden-xs hidden-sm\" href=\"https://twitter.com/theme_blossom\"><img alt=\"theme_blossom on Twitter\" src=\"http://pbs.twimg.com/profile_images/915181647938691072/dX17rt_D_normal.jpg\" class=\"img-circle\"></a>
\t\t\t</div>
\t\t\t<div>
\t\t\t\t<div class=\"tweet_data tbWow fadeIn\">
\t\t\t\t\t Claim your WCEU ticket now <a href=\"https://t.co/xtijZJJ2eY\">https://t.co/xtijZJJ2eY</a>
\t\t\t\t</div>
\t\t\t\t<div class=\"tweet_time tbWow fadeIn\">
\t\t\t\t\t 1 year ago
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t\t</li>
\t\t<li>
\t\t<div class=\"absolutecenter-stretch\">
\t\t\t<div class=\"hidden-xs hidden-sm tweet_avatar tweet_avatar_normal tbWow fadeIn\">
\t\t\t\t<a class=\"hidden-xs hidden-sm\" href=\"https://twitter.com/theme_blossom\"><img alt=\"theme_blossom on Twitter\" src=\"http://pbs.twimg.com/profile_images/915181647938691072/dX17rt_D_normal.jpg\" class=\"img-circle\"></a>
\t\t\t</div>
\t\t\t<div>
\t\t\t\t<div class=\"tweet_data tbWow fadeIn\">
\t\t\t\t\t RT <a href=\"http://twitter.com/wpbeginner\" title=\"Follow wpbeginner\" target=\"_blank\">@wpbeginner</a>: How to Remove Date and Time from <a href=\"https://twitter.com/search?q=%23WordPress\" title=\"Search #WordPress\" target=\"_blank\">#WordPress</a> Comments - <a href=\"https://t.co/l4XJ1ehuSr\">https://t.co/l4XJ1ehuSr</a><a href=\"https://t.co/bFFyZrTB1D\">https://t.co/bFFyZrTB1D</a>
\t\t\t\t</div>
\t\t\t\t<div class=\"tweet_time tbWow fadeIn\">
\t\t\t\t\t 1 year ago
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t\t</li>
\t</ul>
</div>
</aside>
</div>
<div class=\" col-sm-4 col-xs-12 \">
<iframe src=\"http://www.youtube.com/embed/?listType=user_uploads&list=zeenews\" width=\"480\" height=\"400\">
</iframe>
</div>
</div>
</div>
<div class=\" col-sm-12 col-xs-12 \">
<aside id=\"text-2\" class=\"widget widget_text\">
<h3 class=\"widget-title\">About</h3>
<div class=\"textwidget\">
<p>
 Be a part of the movement and participate in building a better future for our country! Join this historical campaign and stand up for the values that make our country great. Make a difference.
</p>
<p>
<strong>The Campaign is paid for By the people for TULF</strong>
</p>
</div>
</aside><aside id=\"woocommerce_products-3\" class=\"widget woocommerce widget_products\">
</aside>
</div>
<div id=\"footer-navigation\">
<div class=\"container\">
<div class=\"row\">
<div class=\"disclaimer-area col-sm-6\">
\t<nav>
\t<div class=\"menu-footer-container\">
\t</div>
\t</nav>
\t<div class=\"clear\">
\t</div>
\t<div class=\"clear\">
\t\t<div class=\"fw-page-builder-content\">
\t\t\t<p>
\t\t\t\t<i class=\"fa fa-copyright\"></i> Copyright - Tulf - All rights reserved . Powered by <i class=\"fa fa-reply-all\"></i>
\t\t\t\t<a href=\"mailto:rambhuchas@gmail.com?Subject=Web%20Inquiry\" target=\"_top\">Rambhuchas</a>
\t\t\t</p>
\t\t</div>
\t</div>
</div>
</div>
</div>
</div>
</footer>", "C:\\wamp64\\www\\kaleidoscope\\install-master/themes/demo/partials/site/footer.htm", "");
    }
}
