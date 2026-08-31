package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.j */
/* JADX INFO: loaded from: classes.dex */
final class C3787j implements DynamiteModule.InterfaceC3777b {
    C3787j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3777b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC3777b.b mo18234a(Context context, String str, DynamiteModule.InterfaceC3777b.a aVar) {
        int iMo18235a;
        DynamiteModule.InterfaceC3777b.b bVar = new DynamiteModule.InterfaceC3777b.b();
        int iZza = aVar.zza(context, str);
        bVar.f14941a = iZza;
        int i7 = 1;
        int i8 = 0;
        if (iZza != 0) {
            iMo18235a = aVar.mo18235a(context, str, false);
            bVar.f14942b = iMo18235a;
        } else {
            iMo18235a = aVar.mo18235a(context, str, true);
            bVar.f14942b = iMo18235a;
        }
        int i9 = bVar.f14941a;
        if (i9 == 0) {
            if (iMo18235a == 0) {
                i7 = 0;
            }
            bVar.f14943c = i7;
            return bVar;
        }
        i8 = i9;
        if (iMo18235a < i8) {
            i7 = -1;
        }
        bVar.f14943c = i7;
        return bVar;
    }
}
