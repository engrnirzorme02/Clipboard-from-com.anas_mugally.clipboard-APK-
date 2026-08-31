package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmv implements zzfmt {
    private final zzfmt zza;

    public zzfmv(zzfmt zzfmtVar) {
        this.zza = zzfmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmt
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZzb = zzfnd.zzb(0, 0, 0, 0);
        int iZzb = zzfng.zzb();
        int i7 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i7 == 0);
            return jSONObjectZzb;
        } catch (JSONException e7) {
            zzfne.zza("Error with setting output device status", e7);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmt
    public final void zzb(View view, JSONObject jSONObject, zzfms zzfmsVar, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        zzfmh zzfmhVarZza = zzfmh.zza();
        if (zzfmhVarZza != null) {
            Collection collectionZzf = zzfmhVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfln) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z9 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i7 = size2 - 1;
                                    if (((View) arrayList.get(i7)).getZ() <= z9) {
                                        break;
                                    } else {
                                        size2 = i7;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i8 = 0; i8 < size3; i8++) {
            zzfmsVar.zza((View) arrayList.get(i8), this.zza, jSONObject, z8);
        }
    }
}
