package p228d4;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p252g4.AbstractC5499i;

/* JADX INFO: renamed from: d4.f */
/* JADX INFO: loaded from: classes.dex */
public class C5234f {

    /* JADX INFO: renamed from: a */
    private final Context f19961a;

    /* JADX INFO: renamed from: b */
    private b f19962b = null;

    /* JADX INFO: renamed from: d4.f$b */
    private class b {

        /* JADX INFO: renamed from: a */
        private final String f19963a;

        /* JADX INFO: renamed from: b */
        private final String f19964b;

        private b() {
            int iM24798p = AbstractC5499i.m24798p(C5234f.this.f19961a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iM24798p == 0) {
                if (!C5234f.this.m24172c("flutter_assets/NOTICES.Z")) {
                    this.f19963a = null;
                    this.f19964b = null;
                    return;
                } else {
                    this.f19963a = "Flutter";
                    this.f19964b = null;
                    C5235g.m24179f().m24186i("Development platform is: Flutter");
                    return;
                }
            }
            this.f19963a = "Unity";
            String string = C5234f.this.f19961a.getResources().getString(iM24798p);
            this.f19964b = string;
            C5235g.m24179f().m24186i("Unity Editor version is: " + string);
        }
    }

    public C5234f(Context context) {
        this.f19961a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m24172c(String str) {
        if (this.f19961a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f19961a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private b m24173f() {
        if (this.f19962b == null) {
            this.f19962b = new b();
        }
        return this.f19962b;
    }

    /* JADX INFO: renamed from: d */
    public String m24174d() {
        return m24173f().f19963a;
    }

    /* JADX INFO: renamed from: e */
    public String m24175e() {
        return m24173f().f19964b;
    }
}
