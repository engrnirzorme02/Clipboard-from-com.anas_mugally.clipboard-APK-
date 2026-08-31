package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.b */
/* JADX INFO: loaded from: classes2.dex */
final class C4772b extends AbstractRunnableC4764H {

    /* JADX INFO: renamed from: r */
    final /* synthetic */ IBinder f18377r;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ ServiceConnectionC4775e f18378s;

    C4772b(ServiceConnectionC4775e serviceConnectionC4775e, IBinder iBinder) {
        this.f18378s = serviceConnectionC4775e;
        this.f18377r = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    public final void mo21834b() {
        this.f18378s.f18380a.f18395n = (IInterface) this.f18378s.f18380a.f18390i.mo21832a(this.f18377r);
        C4776f.m21913r(this.f18378s.f18380a);
        this.f18378s.f18380a.f18388g = false;
        Iterator it = this.f18378s.f18380a.f18385d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f18378s.f18380a.f18385d.clear();
    }
}
