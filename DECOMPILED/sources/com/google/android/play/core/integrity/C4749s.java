package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4781k;
import com.google.android.play.integrity.internal.C4783m;
import com.google.android.play.integrity.internal.InterfaceC4782l;
import com.google.android.play.integrity.internal.InterfaceC4785o;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.s */
/* JADX INFO: loaded from: classes2.dex */
final class C4749s {

    /* JADX INFO: renamed from: a */
    private final C4749s f18346a = this;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4785o f18347b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4785o f18348c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC4785o f18349d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC4785o f18350e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC4785o f18351f;

    /* synthetic */ C4749s(Context context, C4748r c4748r) {
        InterfaceC4782l interfaceC4782lM21928b = C4783m.m21928b(context);
        this.f18347b = interfaceC4782lM21928b;
        InterfaceC4785o interfaceC4785oM21927b = C4781k.m21927b(C4684ac.f18237a);
        this.f18348c = interfaceC4785oM21927b;
        C4702au c4702au = new C4702au(interfaceC4782lM21928b, C4740l.f18339a);
        this.f18349d = c4702au;
        InterfaceC4785o interfaceC4785oM21927b2 = C4781k.m21927b(new C4693al(interfaceC4782lM21928b, interfaceC4785oM21927b, c4702au, C4740l.f18339a));
        this.f18350e = interfaceC4785oM21927b2;
        this.f18351f = C4781k.m21927b(new C4683ab(interfaceC4785oM21927b2));
    }

    /* JADX INFO: renamed from: a */
    public final IntegrityManager m21881a() {
        return (IntegrityManager) this.f18351f.mo21830a();
    }
}
