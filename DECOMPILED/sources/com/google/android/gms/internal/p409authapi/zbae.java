package com.google.android.gms.internal.p409authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.internal.C3690e;
import p114O2.C1137t;

/* JADX INFO: loaded from: classes2.dex */
final class zbae extends C3553a.a {
    zbae() {
    }

    @Override // com.google.android.gms.common.api.C3553a.a
    public final /* synthetic */ C3553a.f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        return new zbg(context, looper, (C1137t) obj, c3690e, interfaceC3598f, interfaceC3616o);
    }
}
