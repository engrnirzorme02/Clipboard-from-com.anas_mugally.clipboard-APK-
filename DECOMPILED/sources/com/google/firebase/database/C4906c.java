package com.google.firebase.database;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import p164V3.C1762g;
import p334q4.C6835b;
import p374v4.C7242g;
import p374v4.C7245j;
import p374v4.C7247l;
import p374v4.C7250o;
import p374v4.C7251p;
import p398y4.AbstractC7551l;
import p398y4.AbstractC7552m;
import p398y4.C7547h;

/* JADX INFO: renamed from: com.google.firebase.database.c */
/* JADX INFO: loaded from: classes.dex */
public class C4906c {

    /* JADX INFO: renamed from: a */
    private final C1762g f18626a;

    /* JADX INFO: renamed from: b */
    private final C7250o f18627b;

    /* JADX INFO: renamed from: c */
    private final C7242g f18628c;

    /* JADX INFO: renamed from: d */
    private C7247l f18629d;

    C4906c(C1762g c1762g, C7250o c7250o, C7242g c7242g) {
        this.f18626a = c1762g;
        this.f18627b = c7250o;
        this.f18628c = c7242g;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m22113a() {
        if (this.f18629d == null) {
            this.f18627b.m32084a(null);
            this.f18629d = C7251p.m32086b(this.f18628c, this.f18627b, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C4906c m22114b(C1762g c1762g) {
        String strM7424d = c1762g.m7407p().m7424d();
        if (strM7424d == null) {
            if (c1762g.m7407p().m7426f() == null) {
                throw new C6835b("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
            strM7424d = "https://" + c1762g.m7407p().m7426f() + "-default-rtdb.firebaseio.com";
        }
        return m22115c(c1762g, strM7424d);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C4906c m22115c(C1762g c1762g, String str) {
        C4907d c4907d;
        C7547h c7547hM33235h;
        if (TextUtils.isEmpty(str)) {
            throw new C6835b("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
        }
        AbstractC3718s.m18084m(c1762g, "Provided FirebaseApp must not be null.");
        c4907d = (C4907d) c1762g.m7404j(C4907d.class);
        AbstractC3718s.m18084m(c4907d, "Firebase Database component is not present.");
        c7547hM33235h = AbstractC7551l.m33235h(str);
        if (!c7547hM33235h.f30194b.isEmpty()) {
            throw new C6835b("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + c7547hM33235h.f30194b.toString());
        }
        return c4907d.m22118a(c7547hM33235h.f30193a);
    }

    /* JADX INFO: renamed from: e */
    public static String m22116e() {
        return "22.0.1";
    }

    /* JADX INFO: renamed from: d */
    public C4905b m22117d(String str) {
        m22113a();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        AbstractC7552m.m33245f(str);
        return new C4905b(this.f18629d, new C7245j(str));
    }
}
