package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.e */
/* JADX INFO: loaded from: classes.dex */
final class C3782e implements DynamiteModule.InterfaceC3777b {
    C3782e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3777b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC3777b.b mo18234a(Context context, String str, DynamiteModule.InterfaceC3777b.a aVar) {
        DynamiteModule.InterfaceC3777b.b bVar = new DynamiteModule.InterfaceC3777b.b();
        int iZza = aVar.zza(context, str);
        bVar.f14941a = iZza;
        if (iZza != 0) {
            bVar.f14943c = -1;
            return bVar;
        }
        int iMo18235a = aVar.mo18235a(context, str, true);
        bVar.f14942b = iMo18235a;
        if (iMo18235a != 0) {
            bVar.f14943c = 1;
        }
        return bVar;
    }
}
