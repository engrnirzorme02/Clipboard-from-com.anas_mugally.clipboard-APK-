package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC3728x;
import com.google.android.gms.common.internal.C3712p;
import com.google.android.gms.common.internal.C3726w;
import com.google.android.gms.common.internal.C3732z;
import com.google.android.gms.common.internal.InterfaceC3730y;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4281m2 {

    /* JADX INFO: renamed from: d */
    private static C4281m2 f15880d;

    /* JADX INFO: renamed from: a */
    private final C4164X2 f15881a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3730y f15882b;

    /* JADX INFO: renamed from: c */
    private final AtomicLong f15883c = new AtomicLong(-1);

    private C4281m2(Context context, C4164X2 c4164x2) {
        this.f15882b = AbstractC3728x.m18107b(context, C3732z.m18111a().m18114b("measurement:api").m18113a());
        this.f15881a = c4164x2;
    }

    /* JADX INFO: renamed from: a */
    static C4281m2 m18823a(C4164X2 c4164x2) {
        if (f15880d == null) {
            f15880d = new C4281m2(c4164x2.mo18424e(), c4164x2);
        }
        return f15880d;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m18824b(int i7, int i8, long j7, long j8, int i9) {
        final long jMo18161c = this.f15881a.mo18425f().mo18161c();
        AtomicLong atomicLong = this.f15883c;
        if (atomicLong.get() != -1 && jMo18161c - atomicLong.get() <= 1800000) {
            return;
        }
        this.f15882b.mo8435a(new C3726w(0, Arrays.asList(new C3712p(36301, i8, 0, j7, j8, null, null, 0, i9)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f15866a.m18825c(jMo18161c, exc);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ void m18825c(long j7, Exception exc) {
        this.f15883c.set(j7);
    }
}
