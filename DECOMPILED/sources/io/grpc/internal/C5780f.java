package io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.f */
/* JADX INFO: loaded from: classes.dex */
final class C5780f implements C5795m0.b {

    /* JADX INFO: renamed from: a */
    private final d f22473a;

    /* JADX INFO: renamed from: b */
    private final C5795m0.b f22474b;

    /* JADX INFO: renamed from: c */
    private final Queue f22475c = new ArrayDeque();

    /* JADX INFO: renamed from: io.grpc.internal.f$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f22476a;

        a(int i7) {
            this.f22476a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5780f.this.f22474b.mo3283d(this.f22476a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.f$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f22478a;

        b(boolean z7) {
            this.f22478a = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5780f.this.f22474b.mo3281c(this.f22478a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.f$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Throwable f22480a;

        c(Throwable th) {
            this.f22480a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5780f.this.f22474b.mo3284e(this.f22480a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.f$d */
    public interface d {
        /* JADX INFO: renamed from: f */
        void mo3285f(Runnable runnable);
    }

    public C5780f(C5795m0.b bVar, d dVar) {
        this.f22474b = (C5795m0.b) AbstractC1209m.m5303o(bVar, "listener");
        this.f22473a = (d) AbstractC1209m.m5303o(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: a */
    public void mo25632a(InterfaceC5755Q0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f22475c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: c */
    public void mo3281c(boolean z7) {
        this.f22473a.mo3285f(new b(z7));
    }

    @Override // io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: d */
    public void mo3283d(int i7) {
        this.f22473a.mo3285f(new a(i7));
    }

    @Override // io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: e */
    public void mo3284e(Throwable th) {
        this.f22473a.mo3285f(new c(th));
    }

    /* JADX INFO: renamed from: f */
    public InputStream m25919f() {
        return (InputStream) this.f22475c.poll();
    }
}
