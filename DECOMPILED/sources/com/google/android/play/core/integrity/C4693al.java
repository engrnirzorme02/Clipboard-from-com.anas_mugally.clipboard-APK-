package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4763G;
import com.google.android.play.integrity.internal.InterfaceC4782l;
import com.google.android.play.integrity.internal.InterfaceC4785o;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.al */
/* JADX INFO: loaded from: classes2.dex */
public final class C4693al implements InterfaceC4782l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC4785o f18259a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4785o f18260b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4785o f18261c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC4785o f18262d;

    public C4693al(InterfaceC4785o interfaceC4785o, InterfaceC4785o interfaceC4785o2, InterfaceC4785o interfaceC4785o3, InterfaceC4785o interfaceC4785o4) {
        this.f18259a = interfaceC4785o;
        this.f18260b = interfaceC4785o2;
        this.f18261c = interfaceC4785o3;
        this.f18262d = interfaceC4785o4;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4785o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21830a() {
        return new C4691aj((Context) this.f18259a.mo21830a(), (C4763G) this.f18260b.mo21830a(), ((C4702au) this.f18261c).mo21830a(), new C4737i());
    }
}
