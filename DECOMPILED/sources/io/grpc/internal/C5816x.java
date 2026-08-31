package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p063H5.EnumC0561p;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.x */
/* JADX INFO: loaded from: classes.dex */
final class C5816x {

    /* JADX INFO: renamed from: a */
    private ArrayList f22935a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private volatile EnumC0561p f22936b = EnumC0561p.IDLE;

    /* JADX INFO: renamed from: io.grpc.internal.x$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        final Runnable f22937a;

        /* JADX INFO: renamed from: b */
        final Executor f22938b;

        a(Runnable runnable, Executor executor) {
            this.f22937a = runnable;
            this.f22938b = executor;
        }

        /* JADX INFO: renamed from: a */
        void m26210a() {
            this.f22938b.execute(this.f22937a);
        }
    }

    C5816x() {
    }

    /* JADX INFO: renamed from: a */
    EnumC0561p m26207a() {
        EnumC0561p enumC0561p = this.f22936b;
        if (enumC0561p != null) {
            return enumC0561p;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    /* JADX INFO: renamed from: b */
    void m26208b(EnumC0561p enumC0561p) {
        AbstractC1209m.m5303o(enumC0561p, "newState");
        if (this.f22936b == enumC0561p || this.f22936b == EnumC0561p.SHUTDOWN) {
            return;
        }
        this.f22936b = enumC0561p;
        if (this.f22935a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f22935a;
        this.f22935a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).m26210a();
        }
    }

    /* JADX INFO: renamed from: c */
    void m26209c(Runnable runnable, Executor executor, EnumC0561p enumC0561p) {
        AbstractC1209m.m5303o(runnable, "callback");
        AbstractC1209m.m5303o(executor, "executor");
        AbstractC1209m.m5303o(enumC0561p, "source");
        a aVar = new a(runnable, executor);
        if (this.f22936b != enumC0561p) {
            aVar.m26210a();
        } else {
            this.f22935a.add(aVar);
        }
    }
}
