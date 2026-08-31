package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.L */
/* JADX INFO: loaded from: classes2.dex */
final class C4768L extends AbstractRunnableC4764H {

    /* JADX INFO: renamed from: r */
    final /* synthetic */ C4776f f18374r;

    C4768L(C4776f c4776f) {
        this.f18374r = c4776f;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    public final void mo21834b() {
        synchronized (this.f18374r.f18387f) {
            try {
                if (this.f18374r.f18393l.get() > 0 && this.f18374r.f18393l.decrementAndGet() > 0) {
                    this.f18374r.f18383b.m21893d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C4776f c4776f = this.f18374r;
                if (c4776f.f18395n != null) {
                    c4776f.f18383b.m21893d("Unbind from service.", new Object[0]);
                    C4776f c4776f2 = this.f18374r;
                    c4776f2.f18382a.unbindService(c4776f2.f18394m);
                    this.f18374r.f18388g = false;
                    this.f18374r.f18395n = null;
                    this.f18374r.f18394m = null;
                }
                this.f18374r.m21916x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
