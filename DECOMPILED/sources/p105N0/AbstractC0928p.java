package p105N0;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p098M0.AbstractC0880j;
import p098M0.AbstractC0881k;

/* JADX INFO: renamed from: N0.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0928p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0913a.b f3594a = new AbstractC0913a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b */
    public static final AbstractC0913a.b f3596b = new AbstractC0913a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c */
    public static final AbstractC0913a.e f3598c = new AbstractC0913a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d */
    public static final AbstractC0913a.c f3600d = new AbstractC0913a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e */
    public static final AbstractC0913a.f f3602e = new AbstractC0913a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f */
    public static final AbstractC0913a.f f3604f = new AbstractC0913a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g */
    public static final AbstractC0913a.f f3606g = new AbstractC0913a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h */
    public static final AbstractC0913a.f f3608h = new AbstractC0913a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i */
    public static final AbstractC0913a.f f3610i = new AbstractC0913a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j */
    public static final AbstractC0913a.f f3612j = new AbstractC0913a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k */
    public static final AbstractC0913a.c f3614k = new AbstractC0913a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l */
    public static final AbstractC0913a.c f3616l = new AbstractC0913a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m */
    public static final AbstractC0913a.c f3618m = new AbstractC0913a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n */
    public static final AbstractC0913a.c f3620n = new AbstractC0913a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o */
    public static final AbstractC0913a.c f3622o = new AbstractC0913a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p */
    public static final AbstractC0913a.c f3624p = new AbstractC0913a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q */
    public static final AbstractC0913a.b f3626q = new AbstractC0913a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r */
    public static final AbstractC0913a.b f3628r = new AbstractC0913a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s */
    public static final AbstractC0913a.c f3630s = new AbstractC0913a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t */
    public static final AbstractC0913a.f f3632t = new AbstractC0913a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u */
    public static final AbstractC0913a.c f3634u = new AbstractC0913a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v */
    public static final AbstractC0913a.b f3636v = new AbstractC0913a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w */
    public static final AbstractC0913a.b f3637w = new AbstractC0913a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x */
    public static final AbstractC0913a.f f3638x = new AbstractC0913a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y */
    public static final AbstractC0913a.f f3639y = new AbstractC0913a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z */
    public static final AbstractC0913a.f f3640z = new AbstractC0913a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* JADX INFO: renamed from: A */
    public static final AbstractC0913a.b f3568A = new AbstractC0913a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* JADX INFO: renamed from: B */
    public static final AbstractC0913a.b f3569B = new AbstractC0913a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* JADX INFO: renamed from: C */
    public static final AbstractC0913a.d f3570C = new AbstractC0913a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* JADX INFO: renamed from: D */
    public static final AbstractC0913a.b f3571D = new AbstractC0913a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* JADX INFO: renamed from: E */
    public static final AbstractC0913a.b f3572E = new AbstractC0913a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: F */
    public static final AbstractC0913a.b f3573F = new AbstractC0913a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: G */
    public static final AbstractC0913a.b f3574G = new AbstractC0913a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: H */
    public static final AbstractC0913a.e f3575H = new AbstractC0913a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: I */
    public static final AbstractC0913a.e f3576I = new AbstractC0913a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* JADX INFO: renamed from: J */
    public static final AbstractC0913a.h f3577J = new AbstractC0913a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* JADX INFO: renamed from: K */
    public static final AbstractC0913a.h f3578K = new AbstractC0913a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* JADX INFO: renamed from: L */
    public static final AbstractC0913a.g f3579L = new AbstractC0913a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: M */
    public static final AbstractC0924l.b f3580M = new AbstractC0924l.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* JADX INFO: renamed from: N */
    public static final AbstractC0924l.a f3581N = new AbstractC0924l.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* JADX INFO: renamed from: O */
    public static final AbstractC0924l.a f3582O = new AbstractC0924l.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");

    /* JADX INFO: renamed from: P */
    public static final AbstractC0913a.h f3583P = new AbstractC0913a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: Q */
    public static final AbstractC0913a.i f3584Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* JADX INFO: renamed from: R */
    public static final AbstractC0913a.d f3585R = new AbstractC0913a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* JADX INFO: renamed from: S */
    public static final AbstractC0913a.d f3586S = new AbstractC0913a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* JADX INFO: renamed from: T */
    public static final AbstractC0913a.h f3587T = new AbstractC0913a.h("FORCE_DARK", "FORCE_DARK");

    /* JADX INFO: renamed from: U */
    public static final AbstractC0913a.d f3588U = new AbstractC0913a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* JADX INFO: renamed from: V */
    public static final AbstractC0913a.d f3589V = new AbstractC0913a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* JADX INFO: renamed from: W */
    public static final AbstractC0913a.d f3590W = new AbstractC0913a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* JADX INFO: renamed from: X */
    public static final AbstractC0913a.d f3591X = new AbstractC0913a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: Y */
    public static final AbstractC0913a.d f3592Y = new AbstractC0913a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* JADX INFO: renamed from: Z */
    public static final AbstractC0913a.d f3593Z = new AbstractC0913a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: a0 */
    public static final AbstractC0913a.d f3595a0 = new AbstractC0913a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: b0 */
    public static final AbstractC0913a.d f3597b0 = new AbstractC0913a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: c0 */
    public static final AbstractC0913a.d f3599c0 = new AbstractC0913a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: d0 */
    public static final AbstractC0913a.d f3601d0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: e0 */
    public static final AbstractC0913a.d f3603e0 = new AbstractC0913a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: f0 */
    public static final AbstractC0913a.d f3605f0 = new AbstractC0913a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: g0 */
    public static final AbstractC0913a.d f3607g0 = new AbstractC0913a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: h0 */
    public static final AbstractC0913a.d f3609h0 = new AbstractC0913a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: i0 */
    public static final AbstractC0913a.d f3611i0 = new AbstractC0913a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: j0 */
    public static final AbstractC0913a.d f3613j0 = new AbstractC0913a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* JADX INFO: renamed from: k0 */
    public static final AbstractC0913a.d f3615k0 = new AbstractC0913a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");

    /* JADX INFO: renamed from: l0 */
    public static final AbstractC0913a.d f3617l0 = new c("PREFETCH_URL_V4", "PREFETCH_URL_V4");

    /* JADX INFO: renamed from: m0 */
    public static final AbstractC0913a.d f3619m0 = new AbstractC0913a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");

    /* JADX INFO: renamed from: n0 */
    public static final AbstractC0913a.d f3621n0 = new AbstractC0913a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");

    /* JADX INFO: renamed from: o0 */
    public static final AbstractC0913a.d f3623o0 = new AbstractC0913a.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");

    /* JADX INFO: renamed from: p0 */
    public static final AbstractC0913a.d f3625p0 = new AbstractC0913a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");

    /* JADX INFO: renamed from: q0 */
    public static final AbstractC0913a.d f3627q0 = new AbstractC0913a.d("SAVE_STATE", "SAVE_STATE");

    /* JADX INFO: renamed from: r0 */
    public static final AbstractC0913a.d f3629r0 = new AbstractC0913a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: s0 */
    public static final AbstractC0913a.d f3631s0 = new AbstractC0913a.d("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");

    /* JADX INFO: renamed from: t0 */
    public static final AbstractC0913a.d f3633t0 = new AbstractC0913a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");

    /* JADX INFO: renamed from: u0 */
    public static final AbstractC0913a.d f3635u0 = new AbstractC0913a.d("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");

    /* JADX INFO: renamed from: N0.p$a */
    class a extends AbstractC0913a.i {

        /* JADX INFO: renamed from: d */
        private final Pattern f3641d;

        a(String str, String str2) {
            super(str, str2);
            this.f3641d = Pattern.compile("\\A\\d+");
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: d */
        public boolean mo4147d() {
            boolean zMo4147d = super.mo4147d();
            if (!zMo4147d || Build.VERSION.SDK_INT >= 29) {
                return zMo4147d;
            }
            PackageInfo packageInfoM4026h = AbstractC0880j.m4026h();
            if (packageInfoM4026h == null) {
                return false;
            }
            Matcher matcher = this.f3641d.matcher(packageInfoM4026h.versionName);
            return matcher.find() && Integer.parseInt(packageInfoM4026h.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* JADX INFO: renamed from: N0.p$b */
    class b extends AbstractC0913a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: d */
        public boolean mo4147d() {
            if (super.mo4147d() && AbstractC0881k.m4035a("MULTI_PROCESS")) {
                return AbstractC0880j.m4030l();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: N0.p$c */
    class c extends AbstractC0913a.d {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: d */
        public boolean mo4147d() {
            if (AbstractC0881k.m4035a("MULTI_PROFILE")) {
                return super.mo4147d();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static UnsupportedOperationException m4158a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4159b(String str) {
        return m4160c(str, AbstractC0913a.m4143e());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4160c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC0917e interfaceC0917e = (InterfaceC0917e) it.next();
            if (interfaceC0917e.mo4145b().equals(str)) {
                hashSet.add(interfaceC0917e);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((InterfaceC0917e) it2.next()).mo4144a()) {
                return true;
            }
        }
        return false;
    }
}
