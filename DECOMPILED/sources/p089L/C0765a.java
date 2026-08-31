package p089L;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.a */
/* JADX INFO: loaded from: classes.dex */
class C0765a {

    /* JADX INFO: renamed from: a */
    private final AbstractC0776l.c f3106a;

    /* JADX INFO: renamed from: b */
    private final Executor f3107b;

    /* JADX INFO: renamed from: L.a$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0776l.c f3108a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Typeface f3109b;

        a(AbstractC0776l.c cVar, Typeface typeface) {
            this.f3108a = cVar;
            this.f3109b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3108a.mo1235b(this.f3109b);
        }
    }

    /* JADX INFO: renamed from: L.a$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0776l.c f3111a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f3112b;

        b(AbstractC0776l.c cVar, int i7) {
            this.f3111a = cVar;
            this.f3112b = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3111a.mo1234a(this.f3112b);
        }
    }

    C0765a(AbstractC0776l.c cVar, Executor executor) {
        this.f3106a = cVar;
        this.f3107b = executor;
    }

    /* JADX INFO: renamed from: a */
    private void m3599a(int i7) {
        this.f3107b.execute(new b(this.f3106a, i7));
    }

    /* JADX INFO: renamed from: c */
    private void m3600c(Typeface typeface) {
        this.f3107b.execute(new a(this.f3106a, typeface));
    }

    /* JADX INFO: renamed from: b */
    void m3601b(AbstractC0774j.e eVar) {
        if (eVar.m3634a()) {
            m3600c(eVar.f3142a);
        } else {
            m3599a(eVar.f3143b);
        }
    }
}
