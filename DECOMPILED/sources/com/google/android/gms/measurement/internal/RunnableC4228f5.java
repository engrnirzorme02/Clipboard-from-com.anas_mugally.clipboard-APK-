package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4228f5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15748a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15749b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15750c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4006B6 f15751d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4364w5 f15752e;

    RunnableC4228f5(C4364w5 c4364w5, AtomicReference atomicReference, String str, String str2, String str3, C4006B6 c4006b6) {
        this.f15748a = atomicReference;
        this.f15749b = str2;
        this.f15750c = str3;
        this.f15751d = c4006b6;
        Objects.requireNonNull(c4364w5);
        this.f15752e = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f15748a;
        synchronized (atomicReference2) {
            try {
                try {
                    C4364w5 c4364w5 = this.f15752e;
                    InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
                    if (interfaceC6033dM19215N == null) {
                        c4364w5.f15066a.mo18421a().m18851o().m18837d("(legacy) Failed to get conditional properties; not connected to service", null, this.f15749b, this.f15750c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        C4006B6 c4006b6 = this.f15751d;
                        AbstractC3718s.m18083l(c4006b6);
                        atomicReference2.set(interfaceC6033dM19215N.mo18745y0(this.f15749b, this.f15750c, c4006b6));
                    } else {
                        atomicReference2.set(interfaceC6033dM19215N.mo18744y(null, this.f15749b, this.f15750c));
                    }
                    c4364w5.m19211J();
                    atomicReference = this.f15748a;
                    atomicReference.notify();
                } catch (RemoteException e7) {
                    this.f15752e.f15066a.mo18421a().m18851o().m18837d("(legacy) Failed to get conditional properties; remote exception", null, this.f15749b, e7);
                    this.f15748a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f15748a;
                }
            } catch (Throwable th) {
                this.f15748a.notify();
                throw th;
            }
        }
    }
}
