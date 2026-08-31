package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4244h5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15799a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15800b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15801c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4006B6 f15802d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ boolean f15803e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C4364w5 f15804f;

    RunnableC4244h5(C4364w5 c4364w5, AtomicReference atomicReference, String str, String str2, String str3, C4006B6 c4006b6, boolean z7) {
        this.f15799a = atomicReference;
        this.f15800b = str2;
        this.f15801c = str3;
        this.f15802d = c4006b6;
        this.f15803e = z7;
        Objects.requireNonNull(c4364w5);
        this.f15804f = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f15799a;
        synchronized (atomicReference2) {
            try {
                try {
                    C4364w5 c4364w5 = this.f15804f;
                    InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
                    if (interfaceC6033dM19215N == null) {
                        c4364w5.f15066a.mo18421a().m18851o().m18837d("(legacy) Failed to get user properties; not connected to service", null, this.f15800b, this.f15801c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        C4006B6 c4006b6 = this.f15802d;
                        AbstractC3718s.m18083l(c4006b6);
                        atomicReference2.set(interfaceC6033dM19215N.mo18740t0(this.f15800b, this.f15801c, this.f15803e, c4006b6));
                    } else {
                        atomicReference2.set(interfaceC6033dM19215N.mo18735d(null, this.f15800b, this.f15801c, this.f15803e));
                    }
                    c4364w5.m19211J();
                    atomicReference = this.f15799a;
                    atomicReference.notify();
                } catch (RemoteException e7) {
                    this.f15804f.f15066a.mo18421a().m18851o().m18837d("(legacy) Failed to get user properties; remote exception", null, this.f15800b, e7);
                    this.f15799a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f15799a;
                }
            } catch (Throwable th) {
                this.f15799a.notify();
                throw th;
            }
        }
    }
}
