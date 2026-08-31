package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.InterfaceC4782l;
import com.google.android.play.integrity.internal.InterfaceC4785o;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.au */
/* JADX INFO: loaded from: classes2.dex */
public final class C4702au implements InterfaceC4782l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC4785o f18279a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4785o f18280b;

    public C4702au(InterfaceC4785o interfaceC4785o, InterfaceC4785o interfaceC4785o2) {
        this.f18279a = interfaceC4785o;
        this.f18280b = interfaceC4785o2;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4785o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4701at mo21830a() {
        return new C4701at(this.f18279a, this.f18280b);
    }
}
