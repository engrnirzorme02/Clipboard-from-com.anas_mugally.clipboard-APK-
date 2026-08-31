package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzggo;
import com.google.android.gms.internal.ads.zzghq;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3456V {
    /* JADX INFO: renamed from: a */
    public static boolean m17492a(int i7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdT)).booleanValue()) {
            return ((Boolean) C3250D.m17200c().zzd(zzbci.zzdU)).booleanValue() || i7 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0131  */
    /* JADX WARN: Code duplicated, block: B:35:0x013d  */
    /* JADX WARN: Code duplicated, block: B:41:0x014e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0156  */
    /* JADX WARN: Code duplicated, block: B:44:0x0158  */
    /* JADX WARN: Code duplicated, block: B:47:0x015d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0161 A[Catch: JSONException -> 0x0165, TRY_ENTER, TryCatch #1 {JSONException -> 0x0165, blocks: (B:32:0x0134, B:49:0x0161, B:52:0x0167, B:53:0x016c), top: B:71:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0167 A[Catch: JSONException -> 0x0165, TryCatch #1 {JSONException -> 0x0165, blocks: (B:32:0x0134, B:49:0x0161, B:52:0x0167, B:53:0x016c), top: B:71:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x016c A[Catch: JSONException -> 0x0165, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0165, blocks: (B:32:0x0134, B:49:0x0161, B:52:0x0167, B:53:0x016c), top: B:71:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static JSONObject m17493b(Context context, View view) {
        int i7;
        ViewParent parent;
        String str;
        int iHashCode;
        int i8;
        JSONObject jSONObjectM17503l;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            int i9 = 1;
            try {
                int[] iArrM17498g = m17498g(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i7 = i9;
                    try {
                        iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                        iArr[i7] = Math.min(viewGroup.getMeasuredHeight(), iArr[i7]);
                        parent2 = parent2.getParent();
                        i9 = i7;
                    } catch (Exception unused) {
                        int i10 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                            try {
                                str = (String) parent.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent, new Object[0]);
                            } catch (IllegalAccessException e7) {
                                e = e7;
                                int i11 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33329d("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (NoSuchMethodException unused2) {
                                str = "";
                            } catch (SecurityException e8) {
                                e = e8;
                                int i12 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33329d("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (InvocationTargetException e9) {
                                e = e9;
                                int i13 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33329d("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        iHashCode = str.hashCode();
                        if (iHashCode != -2066603854) {
                            if (iHashCode != 2019754500) {
                                i8 = -1;
                            } else {
                                i8 = i7;
                            }
                        } else if (str.equals("small_template")) {
                            i8 = 0;
                        } else {
                            i8 = -1;
                        }
                        if (i8 != 0) {
                            jSONObject.put("native_template_type", i7);
                        } else if (i8 != i7) {
                            jSONObject.put("native_template_type", 0);
                        } else {
                            jSONObject.put("native_template_type", 2);
                        }
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziI)).booleanValue()) {
                            try {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                jSONObject.put("view_width_layout_type", m17504m(layoutParams.width) - 1);
                                jSONObject.put("view_height_layout_type", m17504m(layoutParams.height) - 1);
                            } catch (Exception unused3) {
                                AbstractC3490o0.m17545k("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziK)).booleanValue()) {
                            try {
                                jSONObject.put("alpha", view.getAlpha());
                            } catch (JSONException e10) {
                                int i14 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33329d("Could not log container view alpha signal to JSON", e10);
                            }
                        }
                        return jSONObject;
                    }
                }
                i7 = i9;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", C3244B.m17190a().m33292j(context, view.getMeasuredWidth()));
                jSONObject2.put("height", C3244B.m17190a().m33292j(context, view.getMeasuredHeight()));
                jSONObject2.put("x", C3244B.m17190a().m33292j(context, iArrM17498g[0]));
                jSONObject2.put("y", C3244B.m17190a().m33292j(context, iArrM17498g[i7]));
                jSONObject2.put("maximum_visible_width", C3244B.m17190a().m33292j(context, iArr[0]));
                jSONObject2.put("maximum_visible_height", C3244B.m17190a().m33292j(context, iArr[i7]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectM17503l = m17503l(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", C3244B.m17190a().m33292j(context, iArrM17498g[0]));
                    jSONObject3.put("y", C3244B.m17190a().m33292j(context, iArrM17498g[i7]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectM17503l = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectM17503l);
            } catch (Exception unused4) {
                i7 = i9;
            }
            parent = view.getParent();
            if (parent != null) {
                str = (String) parent.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent, new Object[0]);
            } else {
                str = "";
            }
            try {
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode != 2019754500 && str.equals("medium_template")) {
                        i8 = i7;
                    } else {
                        i8 = -1;
                    }
                } else if (str.equals("small_template")) {
                    i8 = 0;
                } else {
                    i8 = -1;
                }
                if (i8 != 0) {
                    jSONObject.put("native_template_type", i7);
                } else if (i8 != i7) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (JSONException e11) {
                int i15 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Could not log native template signal to JSON", e11);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zziI)).booleanValue()) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                jSONObject.put("view_width_layout_type", m17504m(layoutParams2.width) - 1);
                jSONObject.put("view_height_layout_type", m17504m(layoutParams2.height) - 1);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zziK)).booleanValue()) {
                jSONObject.put("alpha", view.getAlpha());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m17494c(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z7 = true;
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zziG)).booleanValue()) {
                    C7351t.m32349g();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                C7351t.m32349g();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z7 = false;
                }
                jSONObject.put("contained_in_scroll_view", z7);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m17495d(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C7351t.m32349g();
                jSONObject.put("can_show_on_lock_screen", C3431F0.m17401a0(view));
                C7351t.m32349g();
                jSONObject.put("is_keyguard_locked", C3431F0.m17414h(context));
                return jSONObject;
            } catch (JSONException unused) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m17496e(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrM17498g = m17498g(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrM17498g2 = m17498g(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = iArrM17498g;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", C3244B.m17190a().m33292j(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", C3244B.m17190a().m33292j(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", C3244B.m17190a().m33292j(context, iArrM17498g2[0] - iArr[0]));
                            jSONObject4.put("y", C3244B.m17190a().m33292j(context, iArrM17498g2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = m17503l(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", C3244B.m17190a().m33292j(context, iArrM17498g2[0] - iArr[0]));
                                jSONObject.put("y", C3244B.m17190a().m33292j(context, iArrM17498g2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zziH)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zziI)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", m17504m(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", m17504m(layoutParams.height) - 1);
                                }
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zziJ)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    int i7 = AbstractC3490o0.f14278b;
                                    AbstractC7599p.m33331f("Unable to get asset views information");
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zziK)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    iArrM17498g = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m17497f(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", C3244B.m17190a().m33292j(context, point2.x));
                    jSONObject3.put("y", C3244B.m17190a().m33292j(context, point2.y));
                    jSONObject3.put("start_x", C3244B.m17190a().m33292j(context, point.x));
                    jSONObject3.put("start_y", C3244B.m17190a().m33292j(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e7) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("Error occurred while putting signals into JSON object.", e7);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e8) {
                e = e8;
                jSONObject = jSONObject2;
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int[] m17498g(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static Point m17499h(MotionEvent motionEvent, View view) {
        int[] iArrM17498g = m17498g(view);
        return new Point(((int) motionEvent.getRawX()) - iArrM17498g[0], ((int) motionEvent.getRawY()) - iArrM17498g[1]);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17500i(Context context, zzfcj zzfcjVar) {
        if (!zzfcjVar.zzN) {
            return false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziL)).booleanValue()) {
            return ((Boolean) C3250D.m17200c().zzd(zzbci.zziO)).booleanValue();
        }
        String str = (String) C3250D.m17200c().zzd(zzbci.zziM);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzghq.zza(zzggo.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static JSONObject m17501j(Context context) {
        JSONObject jSONObject = new JSONObject();
        C7351t.m32349g();
        DisplayMetrics displayMetricsM17415h0 = C3431F0.m17415h0((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", C3244B.m17190a().m33292j(context, displayMetricsM17415h0.widthPixels));
            jSONObject.put("height", C3244B.m17190a().m33292j(context, displayMetricsM17415h0.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static WindowManager.LayoutParams m17502k() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C3250D.m17200c().zzd(zzbci.zziN)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* JADX INFO: renamed from: l */
    private static JSONObject m17503l(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", C3244B.m17190a().m33292j(context, rect.right - rect.left));
        jSONObject.put("height", C3244B.m17190a().m33292j(context, rect.bottom - rect.top));
        jSONObject.put("x", C3244B.m17190a().m33292j(context, rect.left));
        jSONObject.put("y", C3244B.m17190a().m33292j(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX INFO: renamed from: m */
    private static int m17504m(int i7) {
        if (i7 != -2) {
            return i7 != -1 ? 2 : 3;
        }
        return 4;
    }
}
