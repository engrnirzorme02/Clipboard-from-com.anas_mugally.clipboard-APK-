package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmw implements zzfmt {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfmt
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfnd.zzb(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zzfnd.zzb(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfmt
    public final void zzb(View view, JSONObject jSONObject, zzfms zzfmsVar, boolean z7, boolean z8) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z7) {
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    zzfmsVar.zza(viewGroup.getChildAt(i8), this, jSONObject, z8);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i10));
                int size2 = arrayList3.size();
                int i11 = 0;
                while (true) {
                    i7 = i10 + 1;
                    if (i11 < size2) {
                        zzfmsVar.zza((View) arrayList3.get(i11), this, jSONObject, z8);
                        i11++;
                    }
                }
                i10 = i7;
            }
        }
    }
}
