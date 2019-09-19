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

/* C:\wamp64\www\kaleidoscope\install-master/themes/demo/partials/site/header.htm */
class __TwigTemplate_baab471de86d947021e0fb197aeed5826ccf3160ccbf306df8ff9c79dce2b00c extends \Twig\Template
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
        echo "<header id=\"masthead\" class=\"site-header\">
\t<div id=\"main-logo-area\">
\t\t<h1 class=\"site-title\" id=\"main-logo\">
\t\t<a id=\"main-logo-link\" href=\"/\" rel=\"home\">
\t\t<img src=\"themes/demo/assets/images/logo.png\" alt=\"Liberty\" class=\"hidden-xs\">
\t\t<img src=\"themes/demo/assets/images/logo.png\" alt=\"Liberty\" class=\"hidden-sm hidden-md hidden-lg visible-xs\"></a>
\t\t</h1>
\t</div>
\t<div id=\"promo\" class=\"hidden-xs\">
\t\t<div class=\"container\">
\t\t\t<div class=\"row\">
\t\t\t\t<div class=\"col-xs-12 col-sm-6\">
\t\t\t\t\t<div class=\"menu-top-menu-container\">
\t\t\t\t\t\t<ul id=\"menu-top-menu\" class=\"top-nav-menu\">
\t\t\t\t\t\t\t<li id=\"menu-item-840\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-840\">
\t\t\t\t\t\t\t<a href=\"#\" key=\"ABOUT\" class=\"lang\">About Us</a></li>
\t\t\t\t\t\t</ul>
\t\t\t\t\t</div>
\t\t\t\t</div>
\t\t\t\t<div class=\"col-xs-12 col-sm-6\">
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t</div>
\t<div class=\"transl-tion\">
\t\t<div id=\"en-gb\" style=\"float: left; margin: 0px 5px;\">
\t\t\tEnglish
\t\t</div>
\t\t<label class=\"switch\">
\t\t<input type=\"checkbox\" class=\"translate\" checked>
\t\t<span class=\"slider round\"></span>
\t\t</label>
\t\t<div id=\"zh-tw\" style=\"float: right; margin: 0px 5px;\">
\t\t\tதமிழ்
\t\t</div>
\t</div>
\t<div id=\"site-branding\" class=\"header-main\">
\t\t<div class=\"container\">
\t\t\t<nav id=\"primary-navigation\" class=\"site-navigation primary-navigation\">
\t\t\t<div class=\"menu-main-menu-container\">
\t\t\t\t<ul id=\"menu-main-menu\" class=\"nav-menu\">
\t\t\t\t\t<li id=\"menu-item-36\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-9 current_page_item menu-item-36\"><a href=\"#\" key=\"HOME\" class=\"lang\" style=\"padding-right: 35px; padding-left: 35px;\"> Home</a></li>
\t\t\t\t</ul>
\t\t\t</div>
\t\t\t</nav>
\t\t\t<nav id=\"primary-navigation2\" class=\"site-navigation primary-navigation\">
\t\t\t<div class=\"menu-main-menu-2-container\">
\t\t\t\t<ul id=\"menu-main-menu-2\" class=\"nav-menu\">
\t\t\t\t\t<li id=\"menu-item-893\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-893\"><a href=\"#vision/\" key=\"VISION\" class=\"lang\">Vision</a></li>
\t\t\t\t\t<li id=\"menu-item-890\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-890\"><a href=\"#\" class=\"open-popup lang\" key=\"DONATE\" data-id=\"donation_dialog\" data-animation=\"flipRight\">Donate</a>
\t\t\t\t\t</li>
\t\t\t\t\t<li id=\"menu-item-893\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-893\"><a href=\"#contact/\" key=\"CONTACT\" class=\"lang\">Contact</a></li>
\t\t\t\t</ul>
\t\t\t</div>
\t\t\t</nav>
\t\t</div>
\t</div>
\t</header>";
    }

    public function getTemplateName()
    {
        return "C:\\wamp64\\www\\kaleidoscope\\install-master/themes/demo/partials/site/header.htm";
    }

    public function getDebugInfo()
    {
        return array (  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("<header id=\"masthead\" class=\"site-header\">
\t<div id=\"main-logo-area\">
\t\t<h1 class=\"site-title\" id=\"main-logo\">
\t\t<a id=\"main-logo-link\" href=\"/\" rel=\"home\">
\t\t<img src=\"themes/demo/assets/images/logo.png\" alt=\"Liberty\" class=\"hidden-xs\">
\t\t<img src=\"themes/demo/assets/images/logo.png\" alt=\"Liberty\" class=\"hidden-sm hidden-md hidden-lg visible-xs\"></a>
\t\t</h1>
\t</div>
\t<div id=\"promo\" class=\"hidden-xs\">
\t\t<div class=\"container\">
\t\t\t<div class=\"row\">
\t\t\t\t<div class=\"col-xs-12 col-sm-6\">
\t\t\t\t\t<div class=\"menu-top-menu-container\">
\t\t\t\t\t\t<ul id=\"menu-top-menu\" class=\"top-nav-menu\">
\t\t\t\t\t\t\t<li id=\"menu-item-840\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-840\">
\t\t\t\t\t\t\t<a href=\"#\" key=\"ABOUT\" class=\"lang\">About Us</a></li>
\t\t\t\t\t\t</ul>
\t\t\t\t\t</div>
\t\t\t\t</div>
\t\t\t\t<div class=\"col-xs-12 col-sm-6\">
\t\t\t\t</div>
\t\t\t</div>
\t\t</div>
\t</div>
\t<div class=\"transl-tion\">
\t\t<div id=\"en-gb\" style=\"float: left; margin: 0px 5px;\">
\t\t\tEnglish
\t\t</div>
\t\t<label class=\"switch\">
\t\t<input type=\"checkbox\" class=\"translate\" checked>
\t\t<span class=\"slider round\"></span>
\t\t</label>
\t\t<div id=\"zh-tw\" style=\"float: right; margin: 0px 5px;\">
\t\t\tதமிழ்
\t\t</div>
\t</div>
\t<div id=\"site-branding\" class=\"header-main\">
\t\t<div class=\"container\">
\t\t\t<nav id=\"primary-navigation\" class=\"site-navigation primary-navigation\">
\t\t\t<div class=\"menu-main-menu-container\">
\t\t\t\t<ul id=\"menu-main-menu\" class=\"nav-menu\">
\t\t\t\t\t<li id=\"menu-item-36\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-9 current_page_item menu-item-36\"><a href=\"#\" key=\"HOME\" class=\"lang\" style=\"padding-right: 35px; padding-left: 35px;\"> Home</a></li>
\t\t\t\t</ul>
\t\t\t</div>
\t\t\t</nav>
\t\t\t<nav id=\"primary-navigation2\" class=\"site-navigation primary-navigation\">
\t\t\t<div class=\"menu-main-menu-2-container\">
\t\t\t\t<ul id=\"menu-main-menu-2\" class=\"nav-menu\">
\t\t\t\t\t<li id=\"menu-item-893\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-893\"><a href=\"#vision/\" key=\"VISION\" class=\"lang\">Vision</a></li>
\t\t\t\t\t<li id=\"menu-item-890\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-890\"><a href=\"#\" class=\"open-popup lang\" key=\"DONATE\" data-id=\"donation_dialog\" data-animation=\"flipRight\">Donate</a>
\t\t\t\t\t</li>
\t\t\t\t\t<li id=\"menu-item-893\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-893\"><a href=\"#contact/\" key=\"CONTACT\" class=\"lang\">Contact</a></li>
\t\t\t\t</ul>
\t\t\t</div>
\t\t\t</nav>
\t\t</div>
\t</div>
\t</header>", "C:\\wamp64\\www\\kaleidoscope\\install-master/themes/demo/partials/site/header.htm", "");
    }
}
