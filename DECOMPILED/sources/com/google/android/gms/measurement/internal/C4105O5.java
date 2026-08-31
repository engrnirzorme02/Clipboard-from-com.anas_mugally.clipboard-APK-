package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p129Q3.AbstractC1272k;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.O5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4105O5 {

    /* JADX INFO: renamed from: a */
    private final Map f15348a;

    C4105O5(Map map) {
        HashMap map2 = new HashMap();
        this.f15348a = map2;
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: f */
    private final Bundle m18570f() {
        int iM18571g;
        Map map = this.f15348a;
        if ("1".equals(map.get("GoogleConsent")) && (iM18571g = m18571g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(EnumC6051v.AD_STORAGE.f23824a, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(EnumC6051v.AD_PERSONALIZATION.f23824a, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iM18571g >= 4) {
                    String str3 = EnumC6051v.AD_USER_DATA.f23824a;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: g */
    private final int m18571g() {
        try {
            String str = (String) this.f15348a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    final String m18572a() {
        StringBuilder sb = new StringBuilder();
        AbstractC1272k abstractC1272k = AbstractC4119Q5.f15382a;
        int size = abstractC1272k.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str = (String) abstractC1272k.get(i7);
            Map map = this.f15348a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0071, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final Bundle m18573b() {
        Map map;
        Bundle bundle;
        String str;
        String str2;
        C4201c2 c4201c2 = AbstractC4209d2.f15650a1;
        if (((Boolean) c4201c2.m18706b(null)).booleanValue()) {
            Map map2 = this.f15348a;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) c4201c2.m18706b(null)).booleanValue()) {
                    return m18570f();
                }
                map = this.f15348a;
                if (map.get("Version") == null) {
                    return m18570f();
                }
                if (m18571g() >= 0) {
                    bundle = new Bundle();
                    String str3 = EnumC6051v.AD_STORAGE.f23824a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                    String str4 = EnumC6051v.AD_PERSONALIZATION.f23824a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1") || !Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString(str4, str2);
                    if (m18571g() >= 4) {
                        bundle.putString(EnumC6051v.AD_USER_DATA.f23824a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.f15348a;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) c4201c2.m18706b(null)).booleanValue()) {
                    return m18570f();
                }
                map = this.f15348a;
                if (map.get("Version") == null) {
                    return m18570f();
                }
                if (m18571g() >= 0) {
                    bundle = new Bundle();
                    String str5 = EnumC6051v.AD_STORAGE.f23824a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str5, str);
                    String str6 = EnumC6051v.AD_PERSONALIZATION.f23824a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString(str6, str2);
                    if (m18571g() >= 4) {
                        bundle.putString(EnumC6051v.AD_USER_DATA.f23824a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: c */
    public final String m18574c() {
        String str = (String) this.f15348a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    /* JADX INFO: renamed from: d */
    public final String m18575d(C4105O5 c4105o5) {
        Map map = c4105o5.f15348a;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleM18573b = m18573b();
        Bundle bundleM18573b2 = c4105o5.m18573b();
        return str.concat((bundleM18573b.size() == bundleM18573b2.size() && Objects.equals(bundleM18573b.getString("ad_storage"), bundleM18573b2.getString("ad_storage")) && Objects.equals(bundleM18573b.getString("ad_personalization"), bundleM18573b2.getString("ad_personalization")) && Objects.equals(bundleM18573b.getString("ad_user_data"), bundleM18573b2.getString("ad_user_data"))) ? "0" : "1");
    }

    /* JADX INFO: renamed from: e */
    public final String m18576e() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int i7 = -1;
        try {
            String str = (String) this.f15348a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i7 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i7 < 0 || i7 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 & 63));
        }
        int iM18571g = m18571g();
        if (iM18571g < 0 || iM18571g > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM18571g));
        }
        AbstractC3718s.m18072a(true);
        Map map = this.f15348a;
        int i8 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i9 = i8 | 4;
        if (zEquals) {
            i9 = i8 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4105O5) {
            return m18572a().equalsIgnoreCase(((C4105O5) obj).m18572a());
        }
        return false;
    }

    public final int hashCode() {
        return m18572a().hashCode();
    }

    public final String toString() {
        return m18572a();
    }
}
