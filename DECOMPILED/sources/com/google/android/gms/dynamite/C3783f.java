package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.f */
/* JADX INFO: loaded from: classes.dex */
final class C3783f implements DynamiteModule.InterfaceC3777b {
    C3783f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3777b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC3777b.b mo18234a(Context context, String str, DynamiteModule.InterfaceC3777b.a aVar) {
        DynamiteModule.InterfaceC3777b.b bVar = new DynamiteModule.InterfaceC3777b.b();
        int iMo18235a = aVar.mo18235a(context, str, false);
        bVar.f14942b = iMo18235a;
        bVar.f14943c = iMo18235a != 0 ? 1 : 0;
        return bVar;
    }
}
