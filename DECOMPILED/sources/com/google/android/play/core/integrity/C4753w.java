package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4781k;
import com.google.android.play.integrity.internal.C4783m;
import com.google.android.play.integrity.internal.InterfaceC4782l;
import com.google.android.play.integrity.internal.InterfaceC4785o;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.w */
/* JADX INFO: loaded from: classes2.dex */
final class C4753w implements InterfaceC4704aw {

    /* JADX INFO: renamed from: a */
    private final C4753w f18353a = this;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4785o f18354b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4785o f18355c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC4785o f18356d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC4785o f18357e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC4785o f18358f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC4785o f18359g;

    /* synthetic */ C4753w(Context context, C4752v c4752v) {
        InterfaceC4782l interfaceC4782lM21928b = C4783m.m21928b(context);
        this.f18354b = interfaceC4782lM21928b;
        InterfaceC4785o interfaceC4785oM21927b = C4781k.m21927b(C4710bb.f18290a);
        this.f18355c = interfaceC4785oM21927b;
        C4702au c4702au = new C4702au(interfaceC4782lM21928b, C4744n.f18344a);
        this.f18356d = c4702au;
        InterfaceC4785o interfaceC4785oM21927b2 = C4781k.m21927b(new C4724bp(interfaceC4782lM21928b, interfaceC4785oM21927b, c4702au, C4744n.f18344a));
        this.f18357e = interfaceC4785oM21927b2;
        InterfaceC4785o interfaceC4785oM21927b3 = C4781k.m21927b(new C4729bu(interfaceC4785oM21927b2));
        this.f18358f = interfaceC4785oM21927b3;
        this.f18359g = C4781k.m21927b(new C4709ba(interfaceC4785oM21927b2, interfaceC4785oM21927b3));
    }

    @Override // com.google.android.play.core.integrity.InterfaceC4704aw
    /* JADX INFO: renamed from: a */
    public final StandardIntegrityManager mo21849a() {
        return (StandardIntegrityManager) this.f18359g.mo21830a();
    }
}
