package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.concurrent.Executor;
import p217c3.ExecutorC3008a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3610l {

    /* JADX INFO: renamed from: a */
    private final Executor f14669a;

    /* JADX INFO: renamed from: b */
    private volatile Object f14670b;

    /* JADX INFO: renamed from: c */
    private volatile a f14671c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Object f14672a;

        /* JADX INFO: renamed from: b */
        private final String f14673b;

        a(Object obj, String str) {
            this.f14672a = obj;
            this.f14673b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14672a == aVar.f14672a && this.f14673b.equals(aVar.f14673b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f14672a) * 31) + this.f14673b.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l$b */
    public interface b {
        void notifyListener(Object obj);

        void onNotifyListenerFailed();
    }

    C3610l(Looper looper, Object obj, String str) {
        this.f14669a = new ExecutorC3008a(looper);
        this.f14670b = AbstractC3718s.m18084m(obj, "Listener must not be null");
        this.f14671c = new a(obj, AbstractC3718s.m18077f(str));
    }

    /* JADX INFO: renamed from: a */
    public void m17926a() {
        this.f14670b = null;
        this.f14671c = null;
    }

    /* JADX INFO: renamed from: b */
    public a m17927b() {
        return this.f14671c;
    }

    /* JADX INFO: renamed from: c */
    public void m17928c(final b bVar) {
        AbstractC3718s.m18084m(bVar, "Notifier must not be null");
        this.f14669a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f14604a.m17929d(bVar);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    final void m17929d(b bVar) {
        Object obj = this.f14670b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e7) {
            bVar.onNotifyListenerFailed();
            throw e7;
        }
    }
}
