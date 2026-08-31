package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractC2403a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.concurrent.p */
/* JADX INFO: loaded from: classes.dex */
class ScheduledFutureC4901p extends AbstractC2403a implements ScheduledFuture {

    /* JADX INFO: renamed from: s */
    private final ScheduledFuture f18615s;

    /* JADX INFO: renamed from: com.google.firebase.concurrent.p$a */
    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC4901p.b
        /* JADX INFO: renamed from: a */
        public void mo22094a(Throwable th) {
            ScheduledFutureC4901p.this.mo10331y(th);
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC4901p.b
        public void set(Object obj) {
            ScheduledFutureC4901p.this.mo10330x(obj);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.concurrent.p$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo22094a(Throwable th);

        void set(Object obj);
    }

    /* JADX INFO: renamed from: com.google.firebase.concurrent.p$c */
    interface c {
        /* JADX INFO: renamed from: a */
        ScheduledFuture mo22078a(b bVar);
    }

    ScheduledFutureC4901p(c cVar) {
        this.f18615s = cVar.mo22078a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f18615s.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.AbstractC2403a
    /* JADX INFO: renamed from: d */
    protected void mo10327d() {
        this.f18615s.cancel(m10326A());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f18615s.getDelay(timeUnit);
    }
}
