package p371v1;

import android.content.Context;
import android.widget.Toast;
import androidx.core.content.AbstractC2436b;
import androidx.fragment.app.AbstractActivityC2592j;
import com.anas_mugally.clipboard.R;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p329q.C6785e;
import p329q.C6786f;

/* JADX INFO: renamed from: v1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7200a {

    /* JADX INFO: renamed from: h */
    public static final c f28714h = new c(null);

    /* JADX INFO: renamed from: a */
    private final AbstractActivityC2592j f28715a;

    /* JADX INFO: renamed from: b */
    private final String f28716b;

    /* JADX INFO: renamed from: c */
    private final String f28717c;

    /* JADX INFO: renamed from: d */
    private final String f28718d;

    /* JADX INFO: renamed from: e */
    private Executor f28719e;

    /* JADX INFO: renamed from: f */
    private C6786f f28720f;

    /* JADX INFO: renamed from: g */
    private C6786f.d f28721g;

    /* JADX INFO: renamed from: v1.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15618a(int i7, CharSequence charSequence);

        /* JADX INFO: renamed from: b */
        void mo15619b();

        /* JADX INFO: renamed from: c */
        void mo15620c();
    }

    /* JADX INFO: renamed from: v1.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15621a();

        /* JADX INFO: renamed from: b */
        void mo15622b();
    }

    /* JADX INFO: renamed from: v1.a$c */
    public static final class c {
        public /* synthetic */ c(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m31781c(c cVar, Context context, int i7, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                i7 = 15;
            }
            return cVar.m31783b(context, i7);
        }

        /* JADX INFO: renamed from: a */
        public final C7200a m31782a(AbstractActivityC2592j activity, String title, String subtitle, String negativeButtonText) {
            AbstractC6118n.m27187e(activity, "activity");
            AbstractC6118n.m27187e(title, "title");
            AbstractC6118n.m27187e(subtitle, "subtitle");
            AbstractC6118n.m27187e(negativeButtonText, "negativeButtonText");
            return new C7200a(activity, title, subtitle, negativeButtonText);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m31783b(Context context, int i7) {
            AbstractC6118n.m27187e(context, "context");
            C6785e c6785eM29697g = C6785e.m29697g(context);
            AbstractC6118n.m27186d(c6785eM29697g, "from(...)");
            return c6785eM29697g.m29698a(i7) == 0;
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: v1.a$d */
    public static final class d extends C6786f.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ a f28722a;

        d(a aVar) {
            this.f28722a = aVar;
        }

        @Override // p329q.C6786f.a
        /* JADX INFO: renamed from: a */
        public void mo29715a(int i7, CharSequence errString) {
            AbstractC6118n.m27187e(errString, "errString");
            super.mo29715a(i7, errString);
            this.f28722a.mo15618a(i7, errString);
        }

        @Override // p329q.C6786f.a
        /* JADX INFO: renamed from: b */
        public void mo29716b() {
            super.mo29716b();
            this.f28722a.mo15620c();
        }

        @Override // p329q.C6786f.a
        /* JADX INFO: renamed from: c */
        public void mo29717c(C6786f.b result) {
            AbstractC6118n.m27187e(result, "result");
            super.mo29717c(result);
            this.f28722a.mo15619b();
        }
    }

    public C7200a(AbstractActivityC2592j activity, String title, String subtitle, String negativeButtonText) {
        AbstractC6118n.m27187e(activity, "activity");
        AbstractC6118n.m27187e(title, "title");
        AbstractC6118n.m27187e(subtitle, "subtitle");
        AbstractC6118n.m27187e(negativeButtonText, "negativeButtonText");
        this.f28715a = activity;
        this.f28716b = title;
        this.f28717c = subtitle;
        this.f28718d = negativeButtonText;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m31774b(C7200a c7200a, int i7, a aVar, b bVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 15;
        }
        if ((i8 & 4) != 0) {
            bVar = null;
        }
        return c7200a.m31777a(i7, aVar, bVar);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m31775d(C7200a c7200a, int i7, b bVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 15;
        }
        if ((i8 & 2) != 0) {
            bVar = null;
        }
        return c7200a.m31778c(i7, bVar);
    }

    /* JADX INFO: renamed from: g */
    private final void m31776g(String str) {
        Toast.makeText(this.f28715a, str, 1).show();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31777a(int i7, a authCallback, b bVar) {
        AbstractC6118n.m27187e(authCallback, "authCallback");
        m31779e(authCallback);
        if (m31778c(i7, bVar)) {
            return m31780f();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31778c(int i7, b bVar) {
        C6785e c6785eM29697g = C6785e.m29697g(this.f28715a);
        AbstractC6118n.m27186d(c6785eM29697g, "from(...)");
        int iM29698a = c6785eM29697g.m29698a(i7);
        if (iM29698a == 0) {
            if (bVar != null) {
                bVar.mo15622b();
            }
            return true;
        }
        if (iM29698a == 1) {
            String string = this.f28715a.getString(R.string.fingerprint_error2);
            AbstractC6118n.m27186d(string, "getString(...)");
            m31776g(string);
            if (bVar != null) {
                bVar.mo15621a();
            }
            return false;
        }
        if (iM29698a == 11) {
            String string2 = this.f28715a.getString(R.string.fingerprint_error3);
            AbstractC6118n.m27186d(string2, "getString(...)");
            m31776g(string2);
            if (bVar != null) {
                bVar.mo15621a();
            }
            return false;
        }
        if (iM29698a != 12) {
            String string3 = this.f28715a.getString(R.string.fingerprint_error4);
            AbstractC6118n.m27186d(string3, "getString(...)");
            m31776g(string3);
            if (bVar != null) {
                bVar.mo15621a();
            }
            return false;
        }
        String string4 = this.f28715a.getString(R.string.fingerprint_error1);
        AbstractC6118n.m27186d(string4, "getString(...)");
        m31776g(string4);
        if (bVar != null) {
            bVar.mo15621a();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m31779e(a callback) {
        AbstractC6118n.m27187e(callback, "callback");
        Executor mainExecutor = AbstractC2436b.getMainExecutor(this.f28715a);
        this.f28719e = mainExecutor;
        AbstractActivityC2592j abstractActivityC2592j = this.f28715a;
        if (mainExecutor == null) {
            AbstractC6118n.m27197o("executor");
            mainExecutor = null;
        }
        this.f28720f = new C6786f(abstractActivityC2592j, mainExecutor, new d(callback));
        this.f28721g = new C6786f.d.a().m29734d(this.f28716b).m29733c(this.f28717c).m29732b(this.f28718d).m29731a();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m31780f() {
        C6786f c6786f = this.f28720f;
        if (c6786f == null || this.f28721g == null) {
            return false;
        }
        C6786f.d dVar = null;
        if (c6786f == null) {
            AbstractC6118n.m27197o("biometricPrompt");
            c6786f = null;
        }
        C6786f.d dVar2 = this.f28721g;
        if (dVar2 == null) {
            AbstractC6118n.m27197o("promptInfo");
        } else {
            dVar = dVar2;
        }
        c6786f.m29714a(dVar);
        return true;
    }
}
