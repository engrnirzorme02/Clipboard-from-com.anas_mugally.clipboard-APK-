package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkq;
import java.util.Map;
import p129Q3.AbstractC1272k;
import p129Q3.AbstractC1273l;
import p129Q3.AbstractC1274m;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Q5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4119Q5 {

    /* JADX INFO: renamed from: a */
    static final AbstractC1272k f15382a = AbstractC1272k.m5530F("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    /* JADX INFO: renamed from: a */
    static String m18613a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    static int m18614b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    static final boolean m18615c(zzkp zzkpVar, AbstractC1273l abstractC1273l, AbstractC1273l abstractC1273l2, AbstractC1274m abstractC1274m, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        int i12;
        int i13;
        AbstractC1274m abstractC1274m2;
        String str4;
        EnumC4112P5 enumC4112P5;
        char c7;
        int iM18617e = m18617e(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true);
        if (iM18617e > 0) {
            i13 = i9;
            if (i13 == 1) {
                i12 = i8;
                if (i12 != 1) {
                    i13 = 1;
                } else {
                    i12 = 1;
                    i13 = 1;
                }
            } else {
                i12 = i8;
            }
            cArr[iM18617e] = '2';
        } else {
            i12 = i8;
            i13 = i9;
        }
        if (m18621i(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i11, str, str2, str3, z7, z8, true) == zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c7 = '3';
        } else {
            int i14 = i11;
            if (zzkpVar == zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                abstractC1274m2 = abstractC1274m;
                str4 = str;
                if (i14 == 1) {
                    if (abstractC1274m2.contains(str4)) {
                        if (iM18617e > 0 && cArr[iM18617e] != '2') {
                            cArr[iM18617e] = '1';
                        }
                        return true;
                    }
                    i14 = 1;
                }
            } else {
                abstractC1274m2 = abstractC1274m;
                str4 = str;
            }
            if (abstractC1273l.containsKey(zzkpVar) && (enumC4112P5 = (EnumC4112P5) abstractC1273l.get(zzkpVar)) != null) {
                int iOrdinal = enumC4112P5.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return m18621i(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) == zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? m18620h(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) : m18619g(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                        }
                        if (iOrdinal == 3) {
                            return m18621i(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m2, cArr, i7, i12, i13, i10, i14, str4, str2, str3, z7, z8, true) == zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? m18619g(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) : m18620h(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                        }
                        c7 = '0';
                    } else if (m18621i(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) != zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return m18620h(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                    }
                } else if (m18621i(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) != zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return m18619g(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                }
                c7 = '8';
            } else {
                c7 = '0';
            }
        }
        if (iM18617e <= 0 || cArr[iM18617e] == '2') {
            return false;
        }
        cArr[iM18617e] = c7;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final Map m18616d(AbstractC1273l abstractC1273l, AbstractC1273l abstractC1273l2, AbstractC1274m abstractC1274m, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        if (!z9) {
            return AbstractC1273l.m5549k();
        }
        zzkp zzkpVar = zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzkq zzkqVar = (zzkq) abstractC1273l2.get(zzkpVar);
        zzkp zzkpVar2 = zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzkq zzkqVar2 = (zzkq) abstractC1273l2.get(zzkpVar2);
        zzkp zzkpVar3 = zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzkq zzkqVar3 = (zzkq) abstractC1273l2.get(zzkpVar3);
        zzkp zzkpVar4 = zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        zzkq zzkqVar4 = (zzkq) abstractC1273l2.get(zzkpVar4);
        return AbstractC1273l.m5546a().m5566f("Version", "2").m5566f("VendorConsent", true != z7 ? "0" : "1").m5566f("VendorLegitimateInterest", true != z8 ? "0" : "1").m5566f("gdprApplies", i9 != 1 ? "0" : "1").m5566f("EnableAdvertiserConsentMode", i8 != 1 ? "0" : "1").m5566f("PolicyVersion", String.valueOf(i10)).m5566f("CmpSdkID", String.valueOf(i7)).m5566f("PurposeOneTreatment", i11 != 1 ? "0" : "1").m5566f("PublisherCC", str).m5566f("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).m5566f("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).m5566f("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).m5566f("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).m5569i(AbstractC1273l.m5550l("Purpose1", m18618f(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true), "Purpose3", m18618f(zzkpVar2, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true), "Purpose4", m18618f(zzkpVar3, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true), "Purpose7", m18618f(zzkpVar4, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true))).m5569i(AbstractC1273l.m5551m("AuthorizePurpose1", true != m18615c(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "AuthorizePurpose3", true != m18615c(zzkpVar2, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "AuthorizePurpose4", true != m18615c(zzkpVar3, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "AuthorizePurpose7", true != m18615c(zzkpVar4, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).m5565c();
    }

    /* JADX INFO: renamed from: e */
    private static final int m18617e(zzkp zzkpVar, AbstractC1273l abstractC1273l, AbstractC1273l abstractC1273l2, AbstractC1274m abstractC1274m, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    /* JADX INFO: renamed from: f */
    private static final String m18618f(zzkp zzkpVar, AbstractC1273l abstractC1273l, AbstractC1273l abstractC1273l2, AbstractC1274m abstractC1274m, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m18619g(zzkp zzkpVar, AbstractC1273l abstractC1273l, AbstractC1273l abstractC1273l2, AbstractC1274m abstractC1274m, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        char c7;
        int iM18617e = m18617e(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true);
        if (!z7) {
            c7 = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char cCharAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z10 = cCharAt == '1';
                if (iM18617e > 0 && cArr[iM18617e] != '2') {
                    cArr[iM18617e] = cCharAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c7 = '0';
        }
        if (iM18617e > 0 && cArr[iM18617e] != '2') {
            cArr[iM18617e] = c7;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m18620h(zzkp zzkpVar, AbstractC1273l abstractC1273l, AbstractC1273l abstractC1273l2, AbstractC1274m abstractC1274m, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        char c7;
        int iM18617e = m18617e(zzkpVar, abstractC1273l, abstractC1273l2, abstractC1274m, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true);
        if (!z8) {
            c7 = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char cCharAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z10 = cCharAt == '1';
                if (iM18617e > 0 && cArr[iM18617e] != '2') {
                    cArr[iM18617e] = cCharAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c7 = '0';
        }
        if (iM18617e > 0 && cArr[iM18617e] != '2') {
            cArr[iM18617e] = c7;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private static final zzkq m18621i(zzkp zzkpVar, AbstractC1273l abstractC1273l, AbstractC1273l abstractC1273l2, AbstractC1274m abstractC1274m, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        return (zzkq) abstractC1273l2.getOrDefault(zzkpVar, zzkq.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
