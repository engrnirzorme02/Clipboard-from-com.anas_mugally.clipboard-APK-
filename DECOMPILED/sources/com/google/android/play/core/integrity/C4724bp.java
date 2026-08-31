package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4763G;
import com.google.android.play.integrity.internal.InterfaceC4782l;
import com.google.android.play.integrity.internal.InterfaceC4785o;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bp */
/* JADX INFO: loaded from: classes2.dex */
public final class C4724bp implements InterfaceC4782l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC4785o f18323a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4785o f18324b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4785o f18325c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC4785o f18326d;

    public C4724bp(InterfaceC4785o interfaceC4785o, InterfaceC4785o interfaceC4785o2, InterfaceC4785o interfaceC4785o3, InterfaceC4785o interfaceC4785o4) {
        this.f18323a = interfaceC4785o;
        this.f18324b = interfaceC4785o2;
        this.f18325c = interfaceC4785o3;
        this.f18326d = interfaceC4785o4;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4785o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21830a() {
        return new C4722bn((Context) this.f18323a.mo21830a(), (C4763G) this.f18324b.mo21830a(), ((C4702au) this.f18325c).mo21830a(), new C4738j());
    }
}
