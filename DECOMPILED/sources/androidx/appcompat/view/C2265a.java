package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import p255h.AbstractC5521b;

/* JADX INFO: renamed from: androidx.appcompat.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C2265a {

    /* JADX INFO: renamed from: a */
    private Context f7501a;

    private C2265a(Context context) {
        this.f7501a = context;
    }

    /* JADX INFO: renamed from: b */
    public static C2265a m9367b(Context context) {
        return new C2265a(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m9368a() {
        return this.f7501a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: c */
    public int m9369c() {
        return this.f7501a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: d */
    public int m9370d() {
        Configuration configuration = this.f7501a.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 > 960 && i8 > 720) {
            return 5;
        }
        if (i7 > 720 && i8 > 960) {
            return 5;
        }
        if (i7 >= 500) {
            return 4;
        }
        if (i7 > 640 && i8 > 480) {
            return 4;
        }
        if (i7 <= 480 || i8 <= 640) {
            return i7 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: e */
    public boolean m9371e() {
        return this.f7501a.getResources().getBoolean(AbstractC5521b.f20989a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m9372f() {
        return true;
    }
}
