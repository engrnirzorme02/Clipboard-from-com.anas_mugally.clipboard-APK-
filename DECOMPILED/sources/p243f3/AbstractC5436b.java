package p243f3;

import p170W2.C1839d;

/* JADX INFO: renamed from: f3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5436b {

    /* JADX INFO: renamed from: A */
    public static final C1839d f20704A;

    /* JADX INFO: renamed from: B */
    public static final C1839d f20705B;

    /* JADX INFO: renamed from: C */
    public static final C1839d f20706C;

    /* JADX INFO: renamed from: D */
    public static final C1839d[] f20707D;

    /* JADX INFO: renamed from: a */
    public static final C1839d f20708a;

    /* JADX INFO: renamed from: b */
    public static final C1839d f20709b;

    /* JADX INFO: renamed from: c */
    public static final C1839d f20710c;

    /* JADX INFO: renamed from: d */
    public static final C1839d f20711d;

    /* JADX INFO: renamed from: e */
    public static final C1839d f20712e;

    /* JADX INFO: renamed from: f */
    public static final C1839d f20713f;

    /* JADX INFO: renamed from: g */
    public static final C1839d f20714g;

    /* JADX INFO: renamed from: h */
    public static final C1839d f20715h;

    /* JADX INFO: renamed from: i */
    public static final C1839d f20716i;

    /* JADX INFO: renamed from: j */
    public static final C1839d f20717j;

    /* JADX INFO: renamed from: k */
    public static final C1839d f20718k;

    /* JADX INFO: renamed from: l */
    public static final C1839d f20719l;

    /* JADX INFO: renamed from: m */
    public static final C1839d f20720m;

    /* JADX INFO: renamed from: n */
    public static final C1839d f20721n;

    /* JADX INFO: renamed from: o */
    public static final C1839d f20722o;

    /* JADX INFO: renamed from: p */
    public static final C1839d f20723p;

    /* JADX INFO: renamed from: q */
    public static final C1839d f20724q;

    /* JADX INFO: renamed from: r */
    public static final C1839d f20725r;

    /* JADX INFO: renamed from: s */
    public static final C1839d f20726s;

    /* JADX INFO: renamed from: t */
    public static final C1839d f20727t;

    /* JADX INFO: renamed from: u */
    public static final C1839d f20728u;

    /* JADX INFO: renamed from: v */
    public static final C1839d f20729v;

    /* JADX INFO: renamed from: w */
    public static final C1839d f20730w;

    /* JADX INFO: renamed from: x */
    public static final C1839d f20731x;

    /* JADX INFO: renamed from: y */
    public static final C1839d f20732y;

    /* JADX INFO: renamed from: z */
    public static final C1839d f20733z;

    static {
        C1839d c1839d = new C1839d("cancel_target_direct_transfer", 1L);
        f20708a = c1839d;
        C1839d c1839d2 = new C1839d("delete_credential", 1L);
        f20709b = c1839d2;
        C1839d c1839d3 = new C1839d("delete_device_public_key", 1L);
        f20710c = c1839d3;
        C1839d c1839d4 = new C1839d("get_or_generate_device_public_key", 1L);
        f20711d = c1839d4;
        C1839d c1839d5 = new C1839d("get_passkeys", 1L);
        f20712e = c1839d5;
        C1839d c1839d6 = new C1839d("update_passkey", 1L);
        f20713f = c1839d6;
        C1839d c1839d7 = new C1839d("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        f20714g = c1839d7;
        C1839d c1839d8 = new C1839d("is_user_verifying_platform_authenticator_available", 1L);
        f20715h = c1839d8;
        C1839d c1839d9 = new C1839d("privileged_api_list_credentials", 2L);
        f20716i = c1839d9;
        C1839d c1839d10 = new C1839d("start_target_direct_transfer", 1L);
        f20717j = c1839d10;
        C1839d c1839d11 = new C1839d("first_party_api_get_link_info", 1L);
        f20718k = c1839d11;
        C1839d c1839d12 = new C1839d("zero_party_api_register", 3L);
        f20719l = c1839d12;
        C1839d c1839d13 = new C1839d("zero_party_api_sign", 3L);
        f20720m = c1839d13;
        C1839d c1839d14 = new C1839d("zero_party_api_list_discoverable_credentials", 2L);
        f20721n = c1839d14;
        C1839d c1839d15 = new C1839d("zero_party_api_authenticate_passkey", 3L);
        f20722o = c1839d15;
        C1839d c1839d16 = new C1839d("zero_party_api_register_passkey", 1L);
        f20723p = c1839d16;
        C1839d c1839d17 = new C1839d("zero_party_api_register_passkey_with_sync_account", 1L);
        f20724q = c1839d17;
        C1839d c1839d18 = new C1839d("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
        f20725r = c1839d18;
        C1839d c1839d19 = new C1839d("zero_party_api_get_hybrid_client_sign_pending_intent", 1L);
        f20726s = c1839d19;
        C1839d c1839d20 = new C1839d("get_browser_hybrid_client_sign_pending_intent", 1L);
        f20727t = c1839d20;
        C1839d c1839d21 = new C1839d("get_browser_hybrid_client_registration_pending_intent", 1L);
        f20728u = c1839d21;
        C1839d c1839d22 = new C1839d("privileged_authenticate_passkey", 2L);
        f20729v = c1839d22;
        C1839d c1839d23 = new C1839d("privileged_register_passkey_with_sync_account", 1L);
        f20730w = c1839d23;
        C1839d c1839d24 = new C1839d("zero_party_api_get_privileged_hybrid_client_registration_pending_intent", 1L);
        f20731x = c1839d24;
        C1839d c1839d25 = new C1839d("zero_party_api_get_privileged_hybrid_client_sign_pending_intent", 1L);
        f20732y = c1839d25;
        C1839d c1839d26 = new C1839d("zero_party_api_get_fido_security_key_only_sign_pending_intent", 1L);
        f20733z = c1839d26;
        C1839d c1839d27 = new C1839d("zero_party_api_get_fido_security_key_only_registration_pending_intent", 1L);
        f20704A = c1839d27;
        C1839d c1839d28 = new C1839d("zero_party_api_get_privileged_fido_security_key_only_sign_pending_intent", 1L);
        f20705B = c1839d28;
        C1839d c1839d29 = new C1839d("zero_party_api_get_privileged_fido_security_key_only_registration_pending_intent", 1L);
        f20706C = c1839d29;
        f20707D = new C1839d[]{c1839d, c1839d2, c1839d3, c1839d4, c1839d5, c1839d6, c1839d7, c1839d8, c1839d9, c1839d10, c1839d11, c1839d12, c1839d13, c1839d14, c1839d15, c1839d16, c1839d17, c1839d18, c1839d19, c1839d20, c1839d21, c1839d22, c1839d23, c1839d24, c1839d25, c1839d26, c1839d27, c1839d28, c1839d29};
    }
}
