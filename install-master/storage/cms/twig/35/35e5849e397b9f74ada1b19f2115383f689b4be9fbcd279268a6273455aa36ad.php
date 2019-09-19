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

/* C:\wamp64\www\kaleidoscope\install-master/themes/demo/layouts/default.htm */
class __TwigTemplate_2af9c936a1992f4c0d0d6eb937fbfaf4d041d91e64e22528879d3abd12b126ac extends \Twig\Template
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
        echo "<!DOCTYPE html>
<!--[if IE 7]>
<html class=\"ie ie7\" lang=\"en-US\" prefix=\"og: http://ogp.me/ns#\">
<![endif]-->
<!--[if IE 8]>
<html class=\"ie ie8\" lang=\"en-US\" prefix=\"og: http://ogp.me/ns#\">
<![endif]-->
<!--[if !(IE 7) | !(IE 8) ]><!-->
<html lang=\"en-US\" prefix=\"og: http://ogp.me/ns#\">
<!--<![endif]-->
<head>
<meta charset=\"UTF-8\"/>
<meta name=\"viewport\" content=\"width=device-width\"/>
<link rel=\"profile\" href=\"http://gmpg.org/xfn/11\">
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"32x32\"/>
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"192x192\"/>
<link rel=\"apple-touch-icon-precomposed\" href=\"themes/demo/assets/images/logo.jpg\"/>
<meta name=\"msapplication-TileImage\" content=\"themes/demo/assets/images/logo.jpg\"/>
<title>Tulf -  ";
        // line 19
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, twig_get_attribute($this->env, $this->source, ($context["this"] ?? null), "page", [], "any", false, false, false, 19), "title", [], "any", false, false, false, 19), "html", null, true);
        echo "</title>
<script>
\t/* You can add more configuration options to webfontloader by previously defining the WebFontConfig with your options */
\tif ( typeof WebFontConfig === \"undefined\" ) {
\t\tWebFontConfig = new Object();
\t}
\tWebFontConfig['google'] = {families: ['PT+Sans:400', 'Lora:400', 'Lato:400', 'Noto+Serif:400', 'Oswald:300,400']};
\t(function() {
\t\tvar wf = document.createElement( 'script' );
\t\twf.src = 'https://ajax.googleapis.com/ajax/libs/webfont/1.5.3/webfont.js';
\t\twf.type = 'text/javascript';
\t\twf.async = 'true';
\t\tvar s = document.getElementsByTagName( 'script' )[0];
\t\ts.parentNode.insertBefore( wf, s );
\t})();
</script>
<!-- This site is optimized with the Yoast SEO plugin v6.2 - https://yoa.st/1yg?utm_content=6.2 -->
<meta property=\"og:locale\" content=\"en_US\"/>
<meta property=\"og:type\" content=\"website\"/>
<meta property=\"og:title\" content=\"Home &raquo; TULF\"/>
<meta property=\"og:site_name\" content=\"TULF\"/>
<meta name=\"twitter:card\" content=\"summary\"/>
<meta name=\"twitter:title\" content=\"TULF2019\"/>
<script type='application/ld+json'>{\"@context\":\"http:\\/\\/schema.org\",\"@type\":\"WebSite\",\"@id\":\"#website\",\"url\":\"http:\\/\\/tulf.org\\/\",\"name\":\"Liberty\",\"potentialAction\":{\"@type\":\"SearchAction\",\"target\":\"http:\\/\\/tulf.org\\/?s={search_term_string}\",\"query-input\":\"required name=search_term_string\"}}</script>
<!-- / Yoast SEO plugin. -->
<link rel='dns-prefetch' href='//maxcdn.bootstrapcdn.com'/>
<link rel='dns-prefetch' href='//fonts.googleapis.com'/>
<link href=\"https://fonts.googleapis.com/css?family=Meera+Inimai\" rel=\"stylesheet\">
<link rel='dns-prefetch' href='//s.w.org'/>
<script type=\"text/javascript\">
\twindow._wpemojiSettings = {\"baseUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/11\\/72x72\\/\",\"ext\":\".png\",\"svgUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/11\\/svg\\/\",\"svgExt\":\".svg\",\"source\":{\"concatemoji\":\"themes\\/demo\\/assets\\/javascript\\/wp-emoji-release.min.js?ver=4.9.10\"}};
\t!function(a,b,c){function d(a,b){var c=String.fromCharCode;l.clearRect(0,0,k.width,k.height),l.fillText(c.apply(this,a),0,0);var d=k.toDataURL();l.clearRect(0,0,k.width,k.height),l.fillText(c.apply(this,b),0,0);var e=k.toDataURL();return d===e}function e(a){var b;if(!l||!l.fillText)return!1;switch(l.textBaseline=\"top\",l.font=\"600 32px Arial\",a){case\"flag\":return!(b=d([55356,56826,55356,56819],[55356,56826,8203,55356,56819]))&&(b=d([55356,57332,56128,56423,56128,56418,56128,56421,56128,56430,56128,56423,56128,56447],[55356,57332,8203,56128,56423,8203,56128,56418,8203,56128,56421,8203,56128,56430,8203,56128,56423,8203,56128,56447]),!b);case\"emoji\":return b=d([55358,56760,9792,65039],[55358,56760,8203,9792,65039]),!b}return!1}function f(a){var c=b.createElement(\"script\");c.src=a,c.defer=c.type=\"text/javascript\",b.getElementsByTagName(\"head\")[0].appendChild(c)}var g,h,i,j,k=b.createElement(\"canvas\"),l=k.getContext&&k.getContext(\"2d\");for(j=Array(\"flag\",\"emoji\"),c.supports={everything:!0,everythingExceptFlag:!0},i=0;i<j.length;i++)c.supports[j[i]]=e(j[i]),c.supports.everything=c.supports.everything&&c.supports[j[i]],\"flag\"!==j[i]&&(c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&c.supports[j[i]]);c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&!c.supports.flag,c.DOMReady=!1,c.readyCallback=function(){c.DOMReady=!0},c.supports.everything||(h=function(){c.readyCallback()},b.addEventListener?(b.addEventListener(\"DOMContentLoaded\",h,!1),a.addEventListener(\"load\",h,!1)):(a.attachEvent(\"onload\",h),b.attachEvent(\"onreadystatechange\",function(){\"complete\"===b.readyState&&c.readyCallback()})),g=c.source||{},g.concatemoji?f(g.concatemoji):g.wpemoji&&g.twemoji&&(f(g.twemoji),f(g.wpemoji)))}(window,document,window._wpemojiSettings);
</script>
<link rel='stylesheet' id='aps-animate-css-css' href=\"";
        // line 52
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/custom.css?ver=1.6.9");
        echo " \" type='text/css' media='all'/> 
<link rel='stylesheet' id='aps-animate-css-css' href=\"";
        // line 53
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/animate.css?ver=1.6.9");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='aps-frontend-css-css' href=\"";
        // line 54
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/fend-frontend.css?ver=1.6.9");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='cff-css' href=\"";
        // line 55
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/cff-style.css?ver=2.7.2");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='sb-font-awesome-css' href=\"";
        // line 56
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/sb-font-awesome.min.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='rs-plugin-settings-css' href=\"";
        // line 57
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/settings.css?ver=5.3.1.5");
        echo " \" type='text/css' media='all'/>
 
<link rel='stylesheet' id='woocommerce-layout-css' href=\"";
        // line 59
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/woocommerce-layout.css?ver=3.2.6");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='woocommerce-smallscreen-css' href=\"";
        // line 60
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/woocommerce-smallscreen.css?ver=3.2.6");
        echo " \" type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' id='woocommerce-general-css' href=\"";
        // line 61
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/woocommerce.css?ver=3.2.6");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='tribe-events-full-calendar-style-css' href=\"";
        // line 62
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/tribe-events-full.min.css?ver=4.6.10.1");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='tribe-events-calendar-style-css' href=\"";
        // line 63
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/tribe-events-theme.min.css?ver=4.6.10.1");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='tribe-events-calendar-full-mobile-style-css' href=\"";
        // line 64
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/tribe-events-full-mobile.min.css?ver=4.6.10.1");
        echo " \" type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' id='tribe-events-calendar-mobile-style-css' href=\"";
        // line 65
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/tribe-events-theme-mobile.min.css?ver=4.6.10.1");
        echo " \" type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' id='tribe-events-calendar-override-style-css' href=\"";
        // line 66
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/tribe-events.css?ver=1.2.3");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-ext-builder-frontend-grid-css' href=\"";
        // line 67
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/frontend-grid.css?ver=1.2.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-ext-forms-default-styles-css' href=\"";
        // line 68
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/extfrontend.css?ver=2.7.11");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='font-awesome-css' href=\"";
        // line 69
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/wp-font-awesome.min.css?ver=2.7.11");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='meks_instagram-widget-styles-css' href=\"";
        // line 70
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/widget.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='newsletter-subscription-css' href=\"";
        // line 71
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/newsletter-style.css?ver=5.2.2");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-theme-lato-css' href='//fonts.googleapis.com/css?family=Lato%3A300%2C400%2C700%2C900%2C300italic%2C400italic%2C700italic&#038;ver=1.0' type='text/css' media='all'/>
<link rel='stylesheet' id='genericons-css' href=\"";
        // line 73
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/genericons.css?ver=1.0");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='icomoon-css' href=\"";
        // line 74
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/icomoon.css?ver=1.0");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='style-css' href=\"";
        // line 75
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/style.css?ver=1.0");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='bootstrap-css' href=\"";
        // line 76
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/bootstrap.css?ver=3.3.4");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='bootstrap-theme-css' href=\"";
        // line 77
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/bootstrap-theme.css?ver=3.3.4");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='mmenu-css' href=\"";
        // line 78
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/jquery.mmenu.all.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='selectize-css-css' href=\"";
        // line 79
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/selectize.css?ver=1.0");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='animate-css-css' href=\"";
        // line 80
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/animate.min.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_pp_css-css' href=\"";
        // line 81
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/prettyPhoto.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='flexslider-css' href=\"";
        // line 82
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/flexslider.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_style-css' href=\"";
        // line 83
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/themeblossom.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_options-css' href=\"";
        // line 84
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/options.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_woocommerce-css' href=\"";
        // line 85
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/liberty-woocommerce.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-shortcode-section-backround-video-css' href=\"";
        // line 86
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/jquery.fs.wallpaper.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-icon-box-css' href=\"";
        // line 87
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/fwicon-style.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='slick-css' href=\"";
        // line 88
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/slick.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='slick-theme-css' href=\"";
        // line 89
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/slick-theme.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-shortcode-divider-css' href=\"";
        // line 90
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/fwshortcodes-styles.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='tb-upcoming-event-css' href=\"";
        // line 91
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/tbupcoming-styles.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-media-image-css' href=\"";
        // line 92
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/fwmedia-style.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>
<link rel='stylesheet' id='tb-portfolio-carousel-css' href=\"";
        // line 93
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/tbportfolio-styles.css?ver=4.9.10");
        echo " \" type='text/css' media='all'/>


<script type='text/javascript' src=\"";
        // line 96
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.js?ver=1.12.4");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 97
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery-migrate.min.js?ver=1.4.1");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 98
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/frontend.js?ver=1.6.9");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 99
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.themepunch.tools.min.js?ver=5.3.1.5");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 100
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.themepunch.revolution.min.js?ver=5.3.1.5");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 101
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/script.js?ver=4.9.10");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 102
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/geo-selects.js?ver=4.9.10");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 103
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/paypalstd-script.js?ver=4.9.10");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 104
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/seamless-donations.js?ver=4.9.10");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 105
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript//uuid.js?ver=4.9.10");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 106
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.mmenu.min.all.js?ver=5.4.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 107
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.parallax.js?ver=2.2.2");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 108
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/stickySidebar.js?ver=1.2.2");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 109
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.isotope.min.js?ver=2.0.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 110
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.imagesloaded.min.js?ver=3.1.4");
        echo "\"></script>

<noscript>
</noscript>
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"32x32\"/>
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"192x192\"/>
<link rel=\"apple-touch-icon-precomposed\" href=\"themes/demo/assets/images/logo.jpg\"/>


<link href=\"";
        // line 119
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/vendor.css");
        echo "\" rel=\"stylesheet\">
<link href=\"";
        // line 120
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/css/theme.css");
        echo "\" rel=\"stylesheet\">
 ";
        // line 121
        echo $this->env->getExtension('Cms\Twig\Extension')->assetsFunction('css');
        echo $this->env->getExtension('Cms\Twig\Extension')->displayBlock('styles');
        // line 122
        echo " 
 
</head>
<body class=\"home page-template page-template-page-templates page-template-visual-builder-template page-template-page-templatesvisual-builder-template-php page page-id-9 tribe-no-js masthead-fixed full-width sidebar-widgets animation-effect usePrettyPhoto showStickyNavigation showPromoLine\">
<div id=\"themeblossom_loading_screen\" class=\"pace absolutecenter-all\">
\t<div id=\"themeblossom_loading_screen_logo\">
\t\t<div class=\"loader_ring\">
\t\t</div>
\t\t<img src=\"themes/demo/assets/images/logo.jpg\" width=\"142px;\">
\t</div>
</div>
<div id=\"overlay-menu\" class=\"hidden-xs\">
\t<div id=\"overlay-menu-trigger\">
\t\t<i class=\"icon-cross\"></i>
\t</div>
\t<div class=\"absolutecenter\">
\t\t<div id=\"overlay-menu-holder\">
\t\t\t<div class=\"menu-action-menu-container\">
\t\t\t\t<ul id=\"menu-action-menu\" class=\"overlay-menu absolutecenter\">
\t\t\t\t\t<li id=\"menu-item-40\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-icon menu-item-40\"><a href=\"#volunteer/\" class=\"fa fa-users\"><span>Volunteer</span></a></li>
\t\t\t\t\t<li id=\"menu-item-512\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-icon menu-item-512\"><a href=\"#shop/\" class=\"fa fa-shopping-cart\"><span>Shop</span></a></li>
\t\t\t\t\t<li id=\"menu-item-38\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-icon menu-item-38\"><a href=\"#\" class=\"fa fa-heart btn open-popup\" data-id=\"donation_dialog\" data-animation=\"flipRight\"><span>Donate Now</span></a></li>
\t\t\t\t</ul>
\t\t\t</div>
\t\t</div>
\t</div>
</div>
<div id=\"page\" class=\"hfeed site\">
\t<!-- Header -->
\t<header id=\"layout-header\">
\t";
        // line 152
        $context['__cms_partial_params'] = [];
        echo $this->env->getExtension('Cms\Twig\Extension')->partialFunction("site/header"        , $context['__cms_partial_params']        , true        );
        unset($context['__cms_partial_params']);
        echo " </header>
\t<!-- <header> goes here-->
\t<!-- #masthead -->
\t <!-- Content -->
\t <section id=\"layout-content\">
            ";
        // line 157
        echo $this->env->getExtension('Cms\Twig\Extension')->pageFunction();
        // line 158
        echo "        </section>


<footer id=\"layout-footer\">
\t";
        // line 162
        $context['__cms_partial_params'] = [];
        echo $this->env->getExtension('Cms\Twig\Extension')->partialFunction("site/footer"        , $context['__cms_partial_params']        , true        );
        unset($context['__cms_partial_params']);
        echo " 
</footer>
</div>
<!-- #page -->
<div id=\"donation_dialog\" class=\"popup\">
<div class=\"popup-overlay\">
</div>
<div class=\"popup-content\">
<a href=\"#\" class=\"close-popup\" data-id=\"donation_dialog\" data-animation=\"flipRight\">&times;</a>
<h1>Donate Now!</h1>
<form target=\"_blank\" action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\">
<input type=\"hidden\" name=\"cmd\" value=\"_donations\">
<input type=\"text\" name=\"amount\"></input>
<input type=\"hidden\" name=\"item_name\" value=\"OrganizationXYZ Donation\">
<input type=\"hidden\" name=\"image_url\" src=\"themes/demo/assets/images/logo.jpg\">
<input type=\"image\" name=\"submit\" border=\"0\" src=\"https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif\" alt=\"PayPal - The safer, easier way to pay online\">
</form>
<p>
 Your kind donations helps us to serve the community better and to work for the upliftment and betterment of the people.
</p>
</div>
</div>
<script>
  // jQuery extend functions for popup
  (function(\$) {
    \$.fn.openPopup = function( settings ) {
      var elem = \$(this);
      // Establish our default settings
      var settings = \$.extend({
        anim: 'fade'
      }, settings);
      elem.show();
      elem.find('.popup-content').addClass(settings.anim+'In');
    }
    \$.fn.closePopup = function( settings ) {
      var elem = \$(this);
      // Establish our default settings
      var settings = \$.extend({
        anim: 'fade'
      }, settings);
      elem.find('.popup-content').removeClass(settings.anim+'In').addClass(settings.anim+'Out');
      setTimeout(function(){
          elem.hide();
          elem.find('.popup-content').removeClass(settings.anim+'Out')
        }, 500);
    }
  }(jQuery));
  // Click functions for popup
  jQuery('.open-popup').click(function(){
    jQuery('#'+jQuery(this).data('id')).openPopup({
      anim: (!jQuery(this).attr('data-animation') || jQuery(this).data('animation') == null) ? 'fade' : jQuery(this).data('animation')
    });
  });
  jQuery('.close-popup').click(function(){
    jQuery('#'+jQuery(this).data('id')).closePopup({
      anim: (!jQuery(this).attr('data-animation') || jQuery(this).data('animation') == null) ? 'fade' : jQuery(this).data('animation')
    });
  });
  // To open/close the popup at any functions call the below
  // \$('#popup_default').openPopup();
  // \$('#popup_default').closePopup();
</script>
<!-- Modal Popups End -->
<!-- Custom Facebook Feed JS -->
<script type=\"text/javascript\">
var cfflinkhashtags = \"true\";
</script>
<script>
\t( function ( body ) {
\t\t'use strict';
\t\tbody.className = body.className.replace( /\\btribe-no-js\\b/, 'tribe-js' );
\t} )( document.body );
</script>
<script type='text/javascript'> /* <![CDATA[ */var tribe_l10n_datatables = {\"aria\":{\"sort_ascending\":\": activate to sort column ascending\",\"sort_descending\":\": activate to sort column descending\"},\"length_menu\":\"Show _MENU_ entries\",\"empty_table\":\"No data available in table\",\"info\":\"Showing _START_ to _END_ of _TOTAL_ entries\",\"info_empty\":\"Showing 0 to 0 of 0 entries\",\"info_filtered\":\"(filtered from _MAX_ total entries)\",\"zero_records\":\"No matching records found\",\"search\":\"Search:\",\"all_selected_text\":\"All items on this page were selected. \",\"select_all_link\":\"Select all pages\",\"clear_selection\":\"Clear Selection.\",\"pagination\":{\"all\":\"All\",\"next\":\"Next\",\"previous\":\"Previous\"},\"select\":{\"rows\":{\"0\":\"\",\"_\":\": Selected %d rows\",\"1\":\": Selected 1 row\"}},\"datepicker\":{\"dayNames\":[\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\"],\"dayNamesShort\":[\"Sun\",\"Mon\",\"Tue\",\"Wed\",\"Thu\",\"Fri\",\"Sat\"],\"dayNamesMin\":[\"S\",\"M\",\"T\",\"W\",\"T\",\"F\",\"S\"],\"monthNames\":[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"],\"monthNamesShort\":[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"],\"nextText\":\"Next\",\"prevText\":\"Prev\",\"currentText\":\"Today\",\"closeText\":\"Done\"}};/* ]]> */ </script>
<script type=\"text/javascript\">
\tfunction revslider_showDoubleJqueryError(sliderID) {
\t\tvar errorMessage = \"Revolution Slider Error: You have some jquery.js library include that comes after the revolution files js include.\";
\t\terrorMessage += \"<br> This includes make eliminates the revolution slider libraries, and make it not work.\";
\t\terrorMessage += \"<br><br> To fix it you can:<br>&nbsp;&nbsp;&nbsp; 1. In the Slider Settings -> Troubleshooting set option:  <strong><b>Put JS Includes To Body</b></strong> option to true.\";
\t\terrorMessage += \"<br>&nbsp;&nbsp;&nbsp; 2. Find the double jquery.js include and remove it.\";
\t\terrorMessage = \"<span style='font-size:16px;color:#BC0C06;'>\" + errorMessage + \"</span>\";
\t\t\tjQuery(sliderID).show().html(errorMessage);
\t}
</script>
<script type='text/javascript' src=\"";
        // line 246
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/add-to-cart.min.js?ver=3.2.6");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 247
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.blockUI.min.js?ver=2.70");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 248
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/js.cookie.min.js?ver=2.1.4");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 249
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/cart-fragments.min.js?ver=3.2.6");
        echo "\"></script>

<script type='text/javascript'>
/* <![CDATA[ */
var newsletter = {\"messages\":{\"email_error\":\"The email is not correct\",\"name_error\":\"The name is not correct\",\"surname_error\":\"The last name is not correct\",\"profile_error\":\"\",\"privacy_error\":\"You must accept the privacy statement\"},\"profile_max\":\"20\"};
/* ]]> */
</script>

<script type='text/javascript' src=\"";
        // line 257
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/validate.js?ver=5.2.2");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 258
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/bootstrap.min.js?ver=3.3.4");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 259
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript//core.min.js?ver=1.11.4");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 260
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript//widget.min.js?ver=1.11.4");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 261
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript//tabs.min.js?ver=1.11.4");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 262
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/functions.js?ver=1.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 263
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.customInput.js?ver=1.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 264
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/selectize.js?ver=1.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 265
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/wow.min.js?ver=1.0.1");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 266
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.prettyPhoto.js?ver=3.1.5");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 267
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/themeblossom.js?ver=1.0.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 268
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/themeblossom_loading_screen.js?ver=1.0.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 269
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.waypoints.min.js?ver=4.0.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 270
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.counterup.min.js?ver=1.0");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 271
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/slick.min.js?ver=1.5.6");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 272
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.plugin.min.js?ver=2.0.2");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 273
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/jquery.countdown.min.js?ver=2.0.2");
        echo "\"></script>
<script type='text/javascript' src=\"";
        // line 274
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/wp-embed.min.js?ver=4.9.10");
        echo "\"></script>


<script src=\"";
        // line 277
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/vendor/jquery.js");
        echo "\"></script>
<script src=\"";
        // line 278
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/vendor/bootstrap.js");
        echo "\"></script>
<script src=\"";
        // line 279
        echo $this->extensions['Cms\Twig\Extension']->themeFilter("assets/javascript/app.js");
        echo "\"></script>
";
        // line 280
        $_minify = System\Classes\CombineAssets::instance()->useMinify;
        if ($_minify) {
            echo '<script src="'. Request::getBasePath()
                    .'/modules/system/assets/js/framework.combined-min.js"></script>'.PHP_EOL;
        }
        else {
            echo '<script src="'. Request::getBasePath()
                    .'/modules/system/assets/js/framework.js"></script>'.PHP_EOL;
            echo '<script src="'. Request::getBasePath()
                    .'/modules/system/assets/js/framework.extras.js"></script>'.PHP_EOL;
        }
        echo '<link rel="stylesheet" property="stylesheet" href="'. Request::getBasePath()
                    .'/modules/system/assets/css/framework.extras'.($_minify ? '-min' : '').'.css">'.PHP_EOL;
        unset($_minify);
        echo " ";
        echo $this->env->getExtension('Cms\Twig\Extension')->assetsFunction('js');
        echo $this->env->getExtension('Cms\Twig\Extension')->displayBlock('scripts');
        // line 281
        echo "


<script type='text/javascript'>
\tvar screenRes = jQuery(window).width();
\tstickyNavigation();
\tjQuery(window).scroll(function(){
\t\tstickyNavigation();
\t});
\tfunction stickyNavigation() {
\t\tif (screenRes > 991 && jQuery('body').hasClass('showStickyNavigation')) {
\t\t\tif (jQuery('body').hasClass('showPromoLine')) {
\t\t\t\tpromoLineHeight = jQuery('#promo').height() + 1;
\t\t\t} else {
\t\t\t\tpromoLineHeight = 0;
\t\t\t}
\t\t\tvar yScroll = jQuery(window).scrollTop();
\t\t\tif(yScroll >= promoLineHeight) {
\t\t\t\tjQuery('#site-branding')
\t\t\t\t.addClass('make-it-sticky')
\t\t\t\t.addClass('put-it-on-screen');
\t\t\t} else {
\t\t\t\tjQuery('#site-branding')
\t\t\t\t.removeClass('make-it-sticky')
\t\t\t\t.removeClass('put-it-on-screen');
\t\t\t}
\t\t\tif(yScroll >= promoLineHeight) {
\t\t\t\tjQuery('#main-logo img').css('height', 72)
\t\t\t\t\t.css('width', 71);
\t\t\t\tjQuery('#main-logo-area').addClass('nobackground');
\t\t\t} else {
\t\t\t\tjQuery('#main-logo img').css('height', 143)
\t\t\t\t\t.css('width', 142);
\t\t\t\tjQuery('#main-logo-area').removeClass('nobackground');
\t\t\t}
\t\t}
\t}
\twow = new WOW(
\t\t{
\t\t\tboxClass: \t\t'tbWow',
\t\t\tanimateClass: \t'animated',
\t\t\toffset:       \t0,
\t\t\tmobile:\t\t\tfalse
\t\t}
\t);
\twow.init();
\tjQuery(document).ready(function() {
\t\tjQuery('#secondary, .custom-sidebar-widget').theiaStickySidebar({
\t\t// Settings
\t\tadditionalMarginTop: 60});
\t});
\tvar arrLang = {
\t\t\"en-gb\": {
\t\t\"HOME\": \"Home\",
\t\t\"ABOUT\": \"About Us\",
\t\t\"CONTACT\": \"Contact Us\",
\t\t\"join-our\":\"JOIN OUR EFFORTS\",
\t\t},
\t\t\"zh-tw\": {
\t\t\t\"HOME\": \"முகப்பு\",
\t\t\t\"ABOUT\": \"எங்களை பற்றி\",
\t\t\t\"CONTACT\": \"தொடர்பு\",
\t\t\t\"VISION\" : \"கொள்கை\",
\t\t\t\"DONATE\" : \"தானம்\",
\t\t\t\"join-our\":\"எங்கள் முயற்சிகளை சேருங்கள்\",
\t\t}
\t};
\tjQuery(\".translate\").click(function() {
\t\tvar lang = jQuery(this).prop(\"checked\") ? \"zh-tw\" : \"en-gb\";
\t\tjQuery(\".lang\").each(function(index, element) {
\t\t\tjQuery(this).text(arrLang[lang][jQuery(this).attr(\"key\")]);
\t\t});
\t});
</script>
        

</body>
</html>";
    }

    public function getTemplateName()
    {
        return "C:\\wamp64\\www\\kaleidoscope\\install-master/themes/demo/layouts/default.htm";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  600 => 281,  582 => 280,  578 => 279,  574 => 278,  570 => 277,  564 => 274,  560 => 273,  556 => 272,  552 => 271,  548 => 270,  544 => 269,  540 => 268,  536 => 267,  532 => 266,  528 => 265,  524 => 264,  520 => 263,  516 => 262,  512 => 261,  508 => 260,  504 => 259,  500 => 258,  496 => 257,  485 => 249,  481 => 248,  477 => 247,  473 => 246,  384 => 162,  378 => 158,  376 => 157,  366 => 152,  334 => 122,  331 => 121,  327 => 120,  323 => 119,  311 => 110,  307 => 109,  303 => 108,  299 => 107,  295 => 106,  291 => 105,  287 => 104,  283 => 103,  279 => 102,  275 => 101,  271 => 100,  267 => 99,  263 => 98,  259 => 97,  255 => 96,  249 => 93,  245 => 92,  241 => 91,  237 => 90,  233 => 89,  229 => 88,  225 => 87,  221 => 86,  217 => 85,  213 => 84,  209 => 83,  205 => 82,  201 => 81,  197 => 80,  193 => 79,  189 => 78,  185 => 77,  181 => 76,  177 => 75,  173 => 74,  169 => 73,  164 => 71,  160 => 70,  156 => 69,  152 => 68,  148 => 67,  144 => 66,  140 => 65,  136 => 64,  132 => 63,  128 => 62,  124 => 61,  120 => 60,  116 => 59,  111 => 57,  107 => 56,  103 => 55,  99 => 54,  95 => 53,  91 => 52,  55 => 19,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("<!DOCTYPE html>
<!--[if IE 7]>
<html class=\"ie ie7\" lang=\"en-US\" prefix=\"og: http://ogp.me/ns#\">
<![endif]-->
<!--[if IE 8]>
<html class=\"ie ie8\" lang=\"en-US\" prefix=\"og: http://ogp.me/ns#\">
<![endif]-->
<!--[if !(IE 7) | !(IE 8) ]><!-->
<html lang=\"en-US\" prefix=\"og: http://ogp.me/ns#\">
<!--<![endif]-->
<head>
<meta charset=\"UTF-8\"/>
<meta name=\"viewport\" content=\"width=device-width\"/>
<link rel=\"profile\" href=\"http://gmpg.org/xfn/11\">
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"32x32\"/>
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"192x192\"/>
<link rel=\"apple-touch-icon-precomposed\" href=\"themes/demo/assets/images/logo.jpg\"/>
<meta name=\"msapplication-TileImage\" content=\"themes/demo/assets/images/logo.jpg\"/>
<title>Tulf -  {{ this.page.title }}</title>
<script>
\t/* You can add more configuration options to webfontloader by previously defining the WebFontConfig with your options */
\tif ( typeof WebFontConfig === \"undefined\" ) {
\t\tWebFontConfig = new Object();
\t}
\tWebFontConfig['google'] = {families: ['PT+Sans:400', 'Lora:400', 'Lato:400', 'Noto+Serif:400', 'Oswald:300,400']};
\t(function() {
\t\tvar wf = document.createElement( 'script' );
\t\twf.src = 'https://ajax.googleapis.com/ajax/libs/webfont/1.5.3/webfont.js';
\t\twf.type = 'text/javascript';
\t\twf.async = 'true';
\t\tvar s = document.getElementsByTagName( 'script' )[0];
\t\ts.parentNode.insertBefore( wf, s );
\t})();
</script>
<!-- This site is optimized with the Yoast SEO plugin v6.2 - https://yoa.st/1yg?utm_content=6.2 -->
<meta property=\"og:locale\" content=\"en_US\"/>
<meta property=\"og:type\" content=\"website\"/>
<meta property=\"og:title\" content=\"Home &raquo; TULF\"/>
<meta property=\"og:site_name\" content=\"TULF\"/>
<meta name=\"twitter:card\" content=\"summary\"/>
<meta name=\"twitter:title\" content=\"TULF2019\"/>
<script type='application/ld+json'>{\"@context\":\"http:\\/\\/schema.org\",\"@type\":\"WebSite\",\"@id\":\"#website\",\"url\":\"http:\\/\\/tulf.org\\/\",\"name\":\"Liberty\",\"potentialAction\":{\"@type\":\"SearchAction\",\"target\":\"http:\\/\\/tulf.org\\/?s={search_term_string}\",\"query-input\":\"required name=search_term_string\"}}</script>
<!-- / Yoast SEO plugin. -->
<link rel='dns-prefetch' href='//maxcdn.bootstrapcdn.com'/>
<link rel='dns-prefetch' href='//fonts.googleapis.com'/>
<link href=\"https://fonts.googleapis.com/css?family=Meera+Inimai\" rel=\"stylesheet\">
<link rel='dns-prefetch' href='//s.w.org'/>
<script type=\"text/javascript\">
\twindow._wpemojiSettings = {\"baseUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/11\\/72x72\\/\",\"ext\":\".png\",\"svgUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/11\\/svg\\/\",\"svgExt\":\".svg\",\"source\":{\"concatemoji\":\"themes\\/demo\\/assets\\/javascript\\/wp-emoji-release.min.js?ver=4.9.10\"}};
\t!function(a,b,c){function d(a,b){var c=String.fromCharCode;l.clearRect(0,0,k.width,k.height),l.fillText(c.apply(this,a),0,0);var d=k.toDataURL();l.clearRect(0,0,k.width,k.height),l.fillText(c.apply(this,b),0,0);var e=k.toDataURL();return d===e}function e(a){var b;if(!l||!l.fillText)return!1;switch(l.textBaseline=\"top\",l.font=\"600 32px Arial\",a){case\"flag\":return!(b=d([55356,56826,55356,56819],[55356,56826,8203,55356,56819]))&&(b=d([55356,57332,56128,56423,56128,56418,56128,56421,56128,56430,56128,56423,56128,56447],[55356,57332,8203,56128,56423,8203,56128,56418,8203,56128,56421,8203,56128,56430,8203,56128,56423,8203,56128,56447]),!b);case\"emoji\":return b=d([55358,56760,9792,65039],[55358,56760,8203,9792,65039]),!b}return!1}function f(a){var c=b.createElement(\"script\");c.src=a,c.defer=c.type=\"text/javascript\",b.getElementsByTagName(\"head\")[0].appendChild(c)}var g,h,i,j,k=b.createElement(\"canvas\"),l=k.getContext&&k.getContext(\"2d\");for(j=Array(\"flag\",\"emoji\"),c.supports={everything:!0,everythingExceptFlag:!0},i=0;i<j.length;i++)c.supports[j[i]]=e(j[i]),c.supports.everything=c.supports.everything&&c.supports[j[i]],\"flag\"!==j[i]&&(c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&c.supports[j[i]]);c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&!c.supports.flag,c.DOMReady=!1,c.readyCallback=function(){c.DOMReady=!0},c.supports.everything||(h=function(){c.readyCallback()},b.addEventListener?(b.addEventListener(\"DOMContentLoaded\",h,!1),a.addEventListener(\"load\",h,!1)):(a.attachEvent(\"onload\",h),b.attachEvent(\"onreadystatechange\",function(){\"complete\"===b.readyState&&c.readyCallback()})),g=c.source||{},g.concatemoji?f(g.concatemoji):g.wpemoji&&g.twemoji&&(f(g.twemoji),f(g.wpemoji)))}(window,document,window._wpemojiSettings);
</script>
<link rel='stylesheet' id='aps-animate-css-css' href=\"{{ 'assets/css/custom.css?ver=1.6.9'|theme }} \" type='text/css' media='all'/> 
<link rel='stylesheet' id='aps-animate-css-css' href=\"{{ 'assets/css/animate.css?ver=1.6.9'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='aps-frontend-css-css' href=\"{{ 'assets/css/fend-frontend.css?ver=1.6.9'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='cff-css' href=\"{{ 'assets/css/cff-style.css?ver=2.7.2'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='sb-font-awesome-css' href=\"{{ 'assets/css/sb-font-awesome.min.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='rs-plugin-settings-css' href=\"{{ 'assets/css/settings.css?ver=5.3.1.5'|theme }} \" type='text/css' media='all'/>
 
<link rel='stylesheet' id='woocommerce-layout-css' href=\"{{ 'assets/css/woocommerce-layout.css?ver=3.2.6'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='woocommerce-smallscreen-css' href=\"{{ 'assets/css/woocommerce-smallscreen.css?ver=3.2.6'|theme }} \" type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' id='woocommerce-general-css' href=\"{{ 'assets/css/woocommerce.css?ver=3.2.6'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='tribe-events-full-calendar-style-css' href=\"{{ 'assets/css/tribe-events-full.min.css?ver=4.6.10.1'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='tribe-events-calendar-style-css' href=\"{{ 'assets/css/tribe-events-theme.min.css?ver=4.6.10.1'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='tribe-events-calendar-full-mobile-style-css' href=\"{{ 'assets/css/tribe-events-full-mobile.min.css?ver=4.6.10.1'|theme }} \" type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' id='tribe-events-calendar-mobile-style-css' href=\"{{ 'assets/css/tribe-events-theme-mobile.min.css?ver=4.6.10.1'|theme }} \" type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' id='tribe-events-calendar-override-style-css' href=\"{{ 'assets/css/tribe-events.css?ver=1.2.3'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-ext-builder-frontend-grid-css' href=\"{{ 'assets/css/frontend-grid.css?ver=1.2.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-ext-forms-default-styles-css' href=\"{{ 'assets/css/extfrontend.css?ver=2.7.11'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='font-awesome-css' href=\"{{ 'assets/css/wp-font-awesome.min.css?ver=2.7.11'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='meks_instagram-widget-styles-css' href=\"{{ 'assets/css/widget.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='newsletter-subscription-css' href=\"{{ 'assets/css/newsletter-style.css?ver=5.2.2'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-theme-lato-css' href='//fonts.googleapis.com/css?family=Lato%3A300%2C400%2C700%2C900%2C300italic%2C400italic%2C700italic&#038;ver=1.0' type='text/css' media='all'/>
<link rel='stylesheet' id='genericons-css' href=\"{{ 'assets/css/genericons.css?ver=1.0'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='icomoon-css' href=\"{{ 'assets/css/icomoon.css?ver=1.0'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='style-css' href=\"{{ 'assets/css/style.css?ver=1.0'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='bootstrap-css' href=\"{{ 'assets/css/bootstrap.css?ver=3.3.4'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='bootstrap-theme-css' href=\"{{ 'assets/css/bootstrap-theme.css?ver=3.3.4'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='mmenu-css' href=\"{{ 'assets/css/jquery.mmenu.all.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='selectize-css-css' href=\"{{ 'assets/css/selectize.css?ver=1.0'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='animate-css-css' href=\"{{ 'assets/css/animate.min.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_pp_css-css' href=\"{{ 'assets/css/prettyPhoto.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='flexslider-css' href=\"{{ 'assets/css/flexslider.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_style-css' href=\"{{ 'assets/css/themeblossom.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_options-css' href=\"{{ 'assets/css/options.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='liberty_woocommerce-css' href=\"{{ 'assets/css/liberty-woocommerce.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-shortcode-section-backround-video-css' href=\"{{ 'assets/css/jquery.fs.wallpaper.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-icon-box-css' href=\"{{ 'assets/css/fwicon-style.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='slick-css' href=\"{{ 'assets/css/slick.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='slick-theme-css' href=\"{{ 'assets/css/slick-theme.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-shortcode-divider-css' href=\"{{ 'assets/css/fwshortcodes-styles.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='tb-upcoming-event-css' href=\"{{ 'assets/css/tbupcoming-styles.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='fw-media-image-css' href=\"{{ 'assets/css/fwmedia-style.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>
<link rel='stylesheet' id='tb-portfolio-carousel-css' href=\"{{ 'assets/css/tbportfolio-styles.css?ver=4.9.10'|theme }} \" type='text/css' media='all'/>


<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.js?ver=1.12.4' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery-migrate.min.js?ver=1.4.1' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/frontend.js?ver=1.6.9' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.themepunch.tools.min.js?ver=5.3.1.5' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.themepunch.revolution.min.js?ver=5.3.1.5' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/script.js?ver=4.9.10' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/geo-selects.js?ver=4.9.10' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/paypalstd-script.js?ver=4.9.10' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/seamless-donations.js?ver=4.9.10' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript//uuid.js?ver=4.9.10' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.mmenu.min.all.js?ver=5.4.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.parallax.js?ver=2.2.2' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/stickySidebar.js?ver=1.2.2' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.isotope.min.js?ver=2.0.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.imagesloaded.min.js?ver=3.1.4' |theme }}\"></script>

<noscript>
</noscript>
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"32x32\"/>
<link rel=\"icon\" href=\"themes/demo/assets/images/logo.jpg\" sizes=\"192x192\"/>
<link rel=\"apple-touch-icon-precomposed\" href=\"themes/demo/assets/images/logo.jpg\"/>


<link href=\"{{ 'assets/css/vendor.css'|theme }}\" rel=\"stylesheet\">
<link href=\"{{ 'assets/css/theme.css'|theme }}\" rel=\"stylesheet\">
 {% styles %}
 
 
</head>
<body class=\"home page-template page-template-page-templates page-template-visual-builder-template page-template-page-templatesvisual-builder-template-php page page-id-9 tribe-no-js masthead-fixed full-width sidebar-widgets animation-effect usePrettyPhoto showStickyNavigation showPromoLine\">
<div id=\"themeblossom_loading_screen\" class=\"pace absolutecenter-all\">
\t<div id=\"themeblossom_loading_screen_logo\">
\t\t<div class=\"loader_ring\">
\t\t</div>
\t\t<img src=\"themes/demo/assets/images/logo.jpg\" width=\"142px;\">
\t</div>
</div>
<div id=\"overlay-menu\" class=\"hidden-xs\">
\t<div id=\"overlay-menu-trigger\">
\t\t<i class=\"icon-cross\"></i>
\t</div>
\t<div class=\"absolutecenter\">
\t\t<div id=\"overlay-menu-holder\">
\t\t\t<div class=\"menu-action-menu-container\">
\t\t\t\t<ul id=\"menu-action-menu\" class=\"overlay-menu absolutecenter\">
\t\t\t\t\t<li id=\"menu-item-40\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-icon menu-item-40\"><a href=\"#volunteer/\" class=\"fa fa-users\"><span>Volunteer</span></a></li>
\t\t\t\t\t<li id=\"menu-item-512\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-icon menu-item-512\"><a href=\"#shop/\" class=\"fa fa-shopping-cart\"><span>Shop</span></a></li>
\t\t\t\t\t<li id=\"menu-item-38\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-icon menu-item-38\"><a href=\"#\" class=\"fa fa-heart btn open-popup\" data-id=\"donation_dialog\" data-animation=\"flipRight\"><span>Donate Now</span></a></li>
\t\t\t\t</ul>
\t\t\t</div>
\t\t</div>
\t</div>
</div>
<div id=\"page\" class=\"hfeed site\">
\t<!-- Header -->
\t<header id=\"layout-header\">
\t{% partial 'site/header' %} </header>
\t<!-- <header> goes here-->
\t<!-- #masthead -->
\t <!-- Content -->
\t <section id=\"layout-content\">
            {% page %}
        </section>


<footer id=\"layout-footer\">
\t{% partial 'site/footer' %} 
</footer>
</div>
<!-- #page -->
<div id=\"donation_dialog\" class=\"popup\">
<div class=\"popup-overlay\">
</div>
<div class=\"popup-content\">
<a href=\"#\" class=\"close-popup\" data-id=\"donation_dialog\" data-animation=\"flipRight\">&times;</a>
<h1>Donate Now!</h1>
<form target=\"_blank\" action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\">
<input type=\"hidden\" name=\"cmd\" value=\"_donations\">
<input type=\"text\" name=\"amount\"></input>
<input type=\"hidden\" name=\"item_name\" value=\"OrganizationXYZ Donation\">
<input type=\"hidden\" name=\"image_url\" src=\"themes/demo/assets/images/logo.jpg\">
<input type=\"image\" name=\"submit\" border=\"0\" src=\"https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif\" alt=\"PayPal - The safer, easier way to pay online\">
</form>
<p>
 Your kind donations helps us to serve the community better and to work for the upliftment and betterment of the people.
</p>
</div>
</div>
<script>
  // jQuery extend functions for popup
  (function(\$) {
    \$.fn.openPopup = function( settings ) {
      var elem = \$(this);
      // Establish our default settings
      var settings = \$.extend({
        anim: 'fade'
      }, settings);
      elem.show();
      elem.find('.popup-content').addClass(settings.anim+'In');
    }
    \$.fn.closePopup = function( settings ) {
      var elem = \$(this);
      // Establish our default settings
      var settings = \$.extend({
        anim: 'fade'
      }, settings);
      elem.find('.popup-content').removeClass(settings.anim+'In').addClass(settings.anim+'Out');
      setTimeout(function(){
          elem.hide();
          elem.find('.popup-content').removeClass(settings.anim+'Out')
        }, 500);
    }
  }(jQuery));
  // Click functions for popup
  jQuery('.open-popup').click(function(){
    jQuery('#'+jQuery(this).data('id')).openPopup({
      anim: (!jQuery(this).attr('data-animation') || jQuery(this).data('animation') == null) ? 'fade' : jQuery(this).data('animation')
    });
  });
  jQuery('.close-popup').click(function(){
    jQuery('#'+jQuery(this).data('id')).closePopup({
      anim: (!jQuery(this).attr('data-animation') || jQuery(this).data('animation') == null) ? 'fade' : jQuery(this).data('animation')
    });
  });
  // To open/close the popup at any functions call the below
  // \$('#popup_default').openPopup();
  // \$('#popup_default').closePopup();
</script>
<!-- Modal Popups End -->
<!-- Custom Facebook Feed JS -->
<script type=\"text/javascript\">
var cfflinkhashtags = \"true\";
</script>
<script>
\t( function ( body ) {
\t\t'use strict';
\t\tbody.className = body.className.replace( /\\btribe-no-js\\b/, 'tribe-js' );
\t} )( document.body );
</script>
<script type='text/javascript'> /* <![CDATA[ */var tribe_l10n_datatables = {\"aria\":{\"sort_ascending\":\": activate to sort column ascending\",\"sort_descending\":\": activate to sort column descending\"},\"length_menu\":\"Show _MENU_ entries\",\"empty_table\":\"No data available in table\",\"info\":\"Showing _START_ to _END_ of _TOTAL_ entries\",\"info_empty\":\"Showing 0 to 0 of 0 entries\",\"info_filtered\":\"(filtered from _MAX_ total entries)\",\"zero_records\":\"No matching records found\",\"search\":\"Search:\",\"all_selected_text\":\"All items on this page were selected. \",\"select_all_link\":\"Select all pages\",\"clear_selection\":\"Clear Selection.\",\"pagination\":{\"all\":\"All\",\"next\":\"Next\",\"previous\":\"Previous\"},\"select\":{\"rows\":{\"0\":\"\",\"_\":\": Selected %d rows\",\"1\":\": Selected 1 row\"}},\"datepicker\":{\"dayNames\":[\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\"],\"dayNamesShort\":[\"Sun\",\"Mon\",\"Tue\",\"Wed\",\"Thu\",\"Fri\",\"Sat\"],\"dayNamesMin\":[\"S\",\"M\",\"T\",\"W\",\"T\",\"F\",\"S\"],\"monthNames\":[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"],\"monthNamesShort\":[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"],\"nextText\":\"Next\",\"prevText\":\"Prev\",\"currentText\":\"Today\",\"closeText\":\"Done\"}};/* ]]> */ </script>
<script type=\"text/javascript\">
\tfunction revslider_showDoubleJqueryError(sliderID) {
\t\tvar errorMessage = \"Revolution Slider Error: You have some jquery.js library include that comes after the revolution files js include.\";
\t\terrorMessage += \"<br> This includes make eliminates the revolution slider libraries, and make it not work.\";
\t\terrorMessage += \"<br><br> To fix it you can:<br>&nbsp;&nbsp;&nbsp; 1. In the Slider Settings -> Troubleshooting set option:  <strong><b>Put JS Includes To Body</b></strong> option to true.\";
\t\terrorMessage += \"<br>&nbsp;&nbsp;&nbsp; 2. Find the double jquery.js include and remove it.\";
\t\terrorMessage = \"<span style='font-size:16px;color:#BC0C06;'>\" + errorMessage + \"</span>\";
\t\t\tjQuery(sliderID).show().html(errorMessage);
\t}
</script>
<script type='text/javascript' src=\"{{ 'assets/javascript/add-to-cart.min.js?ver=3.2.6' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.blockUI.min.js?ver=2.70' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/js.cookie.min.js?ver=2.1.4' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/cart-fragments.min.js?ver=3.2.6' |theme }}\"></script>

<script type='text/javascript'>
/* <![CDATA[ */
var newsletter = {\"messages\":{\"email_error\":\"The email is not correct\",\"name_error\":\"The name is not correct\",\"surname_error\":\"The last name is not correct\",\"profile_error\":\"\",\"privacy_error\":\"You must accept the privacy statement\"},\"profile_max\":\"20\"};
/* ]]> */
</script>

<script type='text/javascript' src=\"{{ 'assets/javascript/validate.js?ver=5.2.2' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/bootstrap.min.js?ver=3.3.4' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript//core.min.js?ver=1.11.4' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript//widget.min.js?ver=1.11.4' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript//tabs.min.js?ver=1.11.4' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/functions.js?ver=1.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.customInput.js?ver=1.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/selectize.js?ver=1.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/wow.min.js?ver=1.0.1' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.prettyPhoto.js?ver=3.1.5' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/themeblossom.js?ver=1.0.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/themeblossom_loading_screen.js?ver=1.0.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.waypoints.min.js?ver=4.0.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.counterup.min.js?ver=1.0' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/slick.min.js?ver=1.5.6' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.plugin.min.js?ver=2.0.2' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/jquery.countdown.min.js?ver=2.0.2' |theme }}\"></script>
<script type='text/javascript' src=\"{{ 'assets/javascript/wp-embed.min.js?ver=4.9.10' |theme }}\"></script>


<script src=\"{{ 'assets/vendor/jquery.js'|theme }}\"></script>
<script src=\"{{ 'assets/vendor/bootstrap.js'|theme }}\"></script>
<script src=\"{{ 'assets/javascript/app.js'|theme }}\"></script>
{% framework extras %} {% scripts %}



<script type='text/javascript'>
\tvar screenRes = jQuery(window).width();
\tstickyNavigation();
\tjQuery(window).scroll(function(){
\t\tstickyNavigation();
\t});
\tfunction stickyNavigation() {
\t\tif (screenRes > 991 && jQuery('body').hasClass('showStickyNavigation')) {
\t\t\tif (jQuery('body').hasClass('showPromoLine')) {
\t\t\t\tpromoLineHeight = jQuery('#promo').height() + 1;
\t\t\t} else {
\t\t\t\tpromoLineHeight = 0;
\t\t\t}
\t\t\tvar yScroll = jQuery(window).scrollTop();
\t\t\tif(yScroll >= promoLineHeight) {
\t\t\t\tjQuery('#site-branding')
\t\t\t\t.addClass('make-it-sticky')
\t\t\t\t.addClass('put-it-on-screen');
\t\t\t} else {
\t\t\t\tjQuery('#site-branding')
\t\t\t\t.removeClass('make-it-sticky')
\t\t\t\t.removeClass('put-it-on-screen');
\t\t\t}
\t\t\tif(yScroll >= promoLineHeight) {
\t\t\t\tjQuery('#main-logo img').css('height', 72)
\t\t\t\t\t.css('width', 71);
\t\t\t\tjQuery('#main-logo-area').addClass('nobackground');
\t\t\t} else {
\t\t\t\tjQuery('#main-logo img').css('height', 143)
\t\t\t\t\t.css('width', 142);
\t\t\t\tjQuery('#main-logo-area').removeClass('nobackground');
\t\t\t}
\t\t}
\t}
\twow = new WOW(
\t\t{
\t\t\tboxClass: \t\t'tbWow',
\t\t\tanimateClass: \t'animated',
\t\t\toffset:       \t0,
\t\t\tmobile:\t\t\tfalse
\t\t}
\t);
\twow.init();
\tjQuery(document).ready(function() {
\t\tjQuery('#secondary, .custom-sidebar-widget').theiaStickySidebar({
\t\t// Settings
\t\tadditionalMarginTop: 60});
\t});
\tvar arrLang = {
\t\t\"en-gb\": {
\t\t\"HOME\": \"Home\",
\t\t\"ABOUT\": \"About Us\",
\t\t\"CONTACT\": \"Contact Us\",
\t\t\"join-our\":\"JOIN OUR EFFORTS\",
\t\t},
\t\t\"zh-tw\": {
\t\t\t\"HOME\": \"முகப்பு\",
\t\t\t\"ABOUT\": \"எங்களை பற்றி\",
\t\t\t\"CONTACT\": \"தொடர்பு\",
\t\t\t\"VISION\" : \"கொள்கை\",
\t\t\t\"DONATE\" : \"தானம்\",
\t\t\t\"join-our\":\"எங்கள் முயற்சிகளை சேருங்கள்\",
\t\t}
\t};
\tjQuery(\".translate\").click(function() {
\t\tvar lang = jQuery(this).prop(\"checked\") ? \"zh-tw\" : \"en-gb\";
\t\tjQuery(\".lang\").each(function(index, element) {
\t\t\tjQuery(this).text(arrLang[lang][jQuery(this).attr(\"key\")]);
\t\t});
\t});
</script>
        

</body>
</html>", "C:\\wamp64\\www\\kaleidoscope\\install-master/themes/demo/layouts/default.htm", "");
    }
}
