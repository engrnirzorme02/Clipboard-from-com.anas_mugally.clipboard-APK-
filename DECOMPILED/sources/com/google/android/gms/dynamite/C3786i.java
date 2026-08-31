package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.i */
/* JADX INFO: loaded from: classes.dex */
final class C3786i implements DynamiteModule.InterfaceC3777b {
    C3786i() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3777b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC3777b.b mo18234a(Context context, String str, DynamiteModule.InterfaceC3777b.a aVar) {
        DynamiteModule.InterfaceC3777b.b bVar = new DynamiteModule.InterfaceC3777b.b();
        bVar.f14941a = aVar.zza(context, str);
        int i7 = 1;
        int iMo18235a = aVar.mo18235a(context, str, true);
        bVar.f14942b = iMo18235a;
        int i8 = bVar.f14941a;
        if (i8 == 0) {
            i8 = 0;
            if (iMo18235a == 0) {
                i7 = 0;
            } else if (iMo18235a < i8) {
                i7 = -1;
            }
        } else if (iMo18235a < i8) {
            i7 = -1;
        }
        bVar.f14943c = i7;
        return bVar;
    }
}
