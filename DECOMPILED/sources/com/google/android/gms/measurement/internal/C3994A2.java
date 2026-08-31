package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzqp;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.A2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3994A2 {

    /* JADX INFO: renamed from: a */
    private final String f15062a;

    /* JADX INFO: renamed from: b */
    private final Bundle f15063b;

    /* JADX INFO: renamed from: c */
    private Bundle f15064c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4026E2 f15065d;

    public C3994A2(C4026E2 c4026e2, String str, Bundle bundle) {
        Objects.requireNonNull(c4026e2);
        this.f15065d = c4026e2;
        AbstractC3718s.m18077f(str);
        this.f15062a = str;
        this.f15063b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX INFO: renamed from: a */
    public final Bundle m18419a() {
        byte b7;
        if (this.f15064c == null) {
            C4026E2 c4026e2 = this.f15065d;
            String string = c4026e2.m18488p().getString(this.f15062a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b7 = 4;
                                            } else {
                                                b7 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b7 = 3;
                                        } else {
                                            b7 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b7 = 0;
                                    } else {
                                        b7 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b7 = 2;
                                } else {
                                    b7 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b7 = 1;
                            } else {
                                b7 = -1;
                            }
                            if (b7 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b7 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b7 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b7 == 3) {
                                zzqp.zza();
                                if (c4026e2.f15066a.m18686w().m18800H(null, AbstractC4209d2.f15631R0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i8 = 0; i8 < length; i8++) {
                                        iArr[i8] = jSONArray2.optInt(i8);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (b7 != 4) {
                                c4026e2.f15066a.mo18421a().m18851o().m18835b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                zzqp.zza();
                                if (c4026e2.f15066a.m18686w().m18800H(null, AbstractC4209d2.f15631R0)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        jArr[i9] = jSONArray3.optLong(i9);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f15065d.f15066a.mo18421a().m18851o().m18834a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f15064c = bundle;
                } catch (JSONException unused2) {
                    this.f15065d.f15066a.mo18421a().m18851o().m18834a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f15064c == null) {
                this.f15064c = this.f15063b;
            }
        }
        return new Bundle((Bundle) AbstractC3718s.m18083l(this.f15064c));
    }

    /* JADX INFO: renamed from: b */
    public final void m18420b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C4026E2 c4026e2 = this.f15065d;
        SharedPreferences.Editor editorEdit = c4026e2.m18488p().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f15062a);
        } else {
            String str = this.f15062a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzqp.zza();
                        C4164X2 c4164x2 = c4026e2.f15066a;
                        if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15631R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                c4164x2.mo18421a().m18851o().m18835b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                c4164x2.mo18421a().m18851o().m18835b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e7) {
                        this.f15065d.f15066a.mo18421a().m18851o().m18835b("Cannot serialize bundle value to SharedPreferences", e7);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f15064c = bundle2;
    }
}
