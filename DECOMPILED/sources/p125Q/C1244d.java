package p125Q;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: Q.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1244d {

    /* JADX INFO: renamed from: a */
    private final b f4454a;

    /* JADX INFO: renamed from: Q.d$a */
    private static final class a implements b {

        /* JADX INFO: renamed from: a */
        final InputContentInfo f4455a;

        a(Object obj) {
            this.f4455a = (InputContentInfo) obj;
        }

        @Override // p125Q.C1244d.b
        /* JADX INFO: renamed from: a */
        public Uri mo5485a() {
            return this.f4455a.getContentUri();
        }

        @Override // p125Q.C1244d.b
        /* JADX INFO: renamed from: b */
        public void mo5486b() {
            this.f4455a.requestPermission();
        }

        @Override // p125Q.C1244d.b
        /* JADX INFO: renamed from: c */
        public Uri mo5487c() {
            return this.f4455a.getLinkUri();
        }

        @Override // p125Q.C1244d.b
        /* JADX INFO: renamed from: d */
        public Object mo5488d() {
            return this.f4455a;
        }

        @Override // p125Q.C1244d.b
        public ClipDescription getDescription() {
            return this.f4455a.getDescription();
        }
    }

    /* JADX INFO: renamed from: Q.d$b */
    private interface b {
        /* JADX INFO: renamed from: a */
        Uri mo5485a();

        /* JADX INFO: renamed from: b */
        void mo5486b();

        /* JADX INFO: renamed from: c */
        Uri mo5487c();

        /* JADX INFO: renamed from: d */
        Object mo5488d();

        ClipDescription getDescription();
    }

    private C1244d(b bVar) {
        this.f4454a = bVar;
    }

    /* JADX INFO: renamed from: f */
    public static C1244d m5479f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1244d(new a(obj));
    }

    /* JADX INFO: renamed from: a */
    public Uri m5480a() {
        return this.f4454a.mo5485a();
    }

    /* JADX INFO: renamed from: b */
    public ClipDescription m5481b() {
        return this.f4454a.getDescription();
    }

    /* JADX INFO: renamed from: c */
    public Uri m5482c() {
        return this.f4454a.mo5487c();
    }

    /* JADX INFO: renamed from: d */
    public void m5483d() {
        this.f4454a.mo5486b();
    }

    /* JADX INFO: renamed from: e */
    public Object m5484e() {
        return this.f4454a.mo5488d();
    }
}
