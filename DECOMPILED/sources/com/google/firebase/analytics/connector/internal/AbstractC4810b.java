package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p129Q3.AbstractC1272k;
import p129Q3.AbstractC1274m;
import p283k3.AbstractC6054y;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.internal.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4810b {

    /* JADX INFO: renamed from: a */
    private static final AbstractC1274m f18421a = AbstractC1274m.m5571A("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b */
    private static final AbstractC1272k f18422b = AbstractC1272k.m5529D("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c */
    private static final AbstractC1272k f18423c = AbstractC1272k.m5528C("auto", "app", "am");

    /* JADX INFO: renamed from: d */
    private static final AbstractC1272k f18424d = AbstractC1272k.m5527B("_r", "_dbg");

    /* JADX INFO: renamed from: e */
    private static final AbstractC1272k f18425e = new AbstractC1272k.a().m5543i(AbstractC6054y.f23833a).m5543i(AbstractC6054y.f23834b).m5545k();

    /* JADX INFO: renamed from: f */
    private static final AbstractC1272k f18426f = AbstractC1272k.m5527B("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f18427g = 0;

    /* JADX INFO: renamed from: a */
    public static boolean m21958a(String str) {
        return !f18423c.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21959b(String str, Bundle bundle) {
        if (f18422b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC1272k abstractC1272k = f18424d;
        int size = abstractC1272k.size();
        int i7 = 0;
        while (i7 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC1272k.get(i7));
            i7++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21960c(String str) {
        return !f18421a.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21961d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f18425e.contains(str2)) {
            return false;
        }
        AbstractC1272k abstractC1272k = f18426f;
        int size = abstractC1272k.size();
        int i7 = 0;
        while (i7 < size) {
            boolean zMatches = str2.matches((String) abstractC1272k.get(i7));
            i7++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX INFO: renamed from: e */
    public static boolean m21962e(String str, String str2, Bundle bundle) {
        byte b7;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m21958a(str) || bundle == null) {
            return false;
        }
        AbstractC1272k abstractC1272k = f18424d;
        int size = abstractC1272k.size();
        int i7 = 0;
        while (i7 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC1272k.get(i7));
            i7++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b7 = 2;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("fdl")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
        } else if (str.equals("fcm")) {
            b7 = 0;
        } else {
            b7 = -1;
        }
        if (b7 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b7 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b7 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
