package p342r4;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p022C4.C0142a;
import p022C4.C0144c;
import p022C4.InterfaceC0145d;
import p164V3.C1762g;
import p334q4.C6835b;
import p358t4.C7081c;
import p358t4.C7084f;
import p358t4.C7092n;
import p358t4.InterfaceC7086h;
import p374v4.AbstractC7241f;
import p374v4.InterfaceC7244i;
import p374v4.InterfaceC7246k;
import p374v4.InterfaceC7252q;
import p390x4.C7407b;
import p390x4.C7408c;
import p390x4.InterfaceC7410e;
import p398y4.AbstractC7542c;

/* JADX INFO: renamed from: r4.m */
/* JADX INFO: loaded from: classes.dex */
public class C6913m implements InterfaceC7246k {

    /* JADX INFO: renamed from: a */
    private final Context f27735a;

    /* JADX INFO: renamed from: b */
    private final Set f27736b = new HashSet();

    /* JADX INFO: renamed from: c */
    private final C1762g f27737c;

    /* JADX INFO: renamed from: r4.m$a */
    class a extends AbstractC7542c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C0144c f27738b;

        /* JADX INFO: renamed from: r4.m$a$a, reason: collision with other inner class name */
        class RunnableC7718a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f27740a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Throwable f27741b;

            RunnableC7718a(String str, Throwable th) {
                this.f27740a = str;
                this.f27741b = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f27740a, this.f27741b);
            }
        }

        a(C0144c c0144c) {
            this.f27738b = c0144c;
        }

        @Override // p398y4.AbstractC7542c
        /* JADX INFO: renamed from: g */
        public void mo30274g(Throwable th) {
            String strM33183h = AbstractC7542c.m33183h(th);
            this.f27738b.m625c(strM33183h, th);
            new Handler(C6913m.this.f27735a.getMainLooper()).post(new RunnableC7718a(strM33183h, th));
            m33184d().shutdownNow();
        }
    }

    /* JADX INFO: renamed from: r4.m$b */
    class b implements C1762g.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC7086h f27743a;

        b(InterfaceC7086h interfaceC7086h) {
            this.f27743a = interfaceC7086h;
        }

        @Override // p164V3.C1762g.a
        /* JADX INFO: renamed from: a */
        public void mo7385a(boolean z7) {
            if (z7) {
                this.f27743a.mo31245d("app_in_background");
            } else {
                this.f27743a.mo31247g("app_in_background");
            }
        }
    }

    public C6913m(C1762g c1762g) {
        this.f27737c = c1762g;
        if (c1762g != null) {
            this.f27735a = c1762g.m7405l();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // p374v4.InterfaceC7246k
    /* JADX INFO: renamed from: a */
    public InterfaceC7086h mo30267a(AbstractC7241f abstractC7241f, C7081c c7081c, C7084f c7084f, InterfaceC7086h.a aVar) {
        C7092n c7092n = new C7092n(c7081c, c7084f, aVar);
        this.f27737c.m7402g(new b(c7092n));
        return c7092n;
    }

    @Override // p374v4.InterfaceC7246k
    /* JADX INFO: renamed from: b */
    public File mo30268b() {
        return this.f27735a.getApplicationContext().getDir("sslcache", 0);
    }

    @Override // p374v4.InterfaceC7246k
    /* JADX INFO: renamed from: c */
    public InterfaceC0145d mo30269c(AbstractC7241f abstractC7241f, InterfaceC0145d.a aVar, List list) {
        return new C0142a(aVar, list);
    }

    @Override // p374v4.InterfaceC7246k
    /* JADX INFO: renamed from: d */
    public InterfaceC7410e mo30270d(AbstractC7241f abstractC7241f, String str) {
        String strM31978x = abstractC7241f.m31978x();
        String str2 = str + "_" + strM31978x;
        if (!this.f27736b.contains(str2)) {
            this.f27736b.add(str2);
            return new C7407b(abstractC7241f, new C6914n(this.f27735a, abstractC7241f, str2), new C7408c(abstractC7241f.m31974s()));
        }
        throw new C6835b("SessionPersistenceKey '" + strM31978x + "' has already been used.");
    }

    @Override // p374v4.InterfaceC7246k
    /* JADX INFO: renamed from: e */
    public InterfaceC7244i mo30271e(AbstractC7241f abstractC7241f) {
        return new C6912l();
    }

    @Override // p374v4.InterfaceC7246k
    /* JADX INFO: renamed from: f */
    public String mo30272f(AbstractC7241f abstractC7241f) {
        return Build.VERSION.SDK_INT + "/Android";
    }

    @Override // p374v4.InterfaceC7246k
    /* JADX INFO: renamed from: g */
    public InterfaceC7252q mo30273g(AbstractC7241f abstractC7241f) {
        return new a(abstractC7241f.m31972q("RunLoop"));
    }
}
