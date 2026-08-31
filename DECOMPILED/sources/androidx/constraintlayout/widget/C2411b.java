package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public class C2411b {

    /* JADX INFO: renamed from: a */
    private boolean f8630a;

    /* JADX INFO: renamed from: b */
    String f8631b;

    /* JADX INFO: renamed from: c */
    private a f8632c;

    /* JADX INFO: renamed from: d */
    private int f8633d;

    /* JADX INFO: renamed from: e */
    private float f8634e;

    /* JADX INFO: renamed from: f */
    private String f8635f;

    /* JADX INFO: renamed from: g */
    boolean f8636g;

    /* JADX INFO: renamed from: h */
    private int f8637h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$a */
    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C2411b(String str, a aVar, Object obj, boolean z7) {
        this.f8631b = str;
        this.f8632c = aVar;
        this.f8630a = z7;
        m10385d(obj);
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m10382a(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C2411b c2411b = (C2411b) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new C2411b(c2411b, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new C2411b(c2411b, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e7) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e7);
            } catch (NoSuchMethodException e8) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e8);
            } catch (InvocationTargetException e9) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e9);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: b */
    public static void m10383b(Context context, XmlPullParser xmlPullParser, HashMap map) {
        a aVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2418i.f9173t4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        a aVar2 = null;
        boolean z7 = false;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == AbstractC2418i.f9181u4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == AbstractC2418i.f8843E4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z7 = true;
            } else if (index == AbstractC2418i.f9189v4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == AbstractC2418i.f9205x4) {
                    aVar = a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == AbstractC2418i.f9197w4) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == AbstractC2418i.f8819B4) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == AbstractC2418i.f9213y4) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == AbstractC2418i.f9221z4) {
                    aVar = a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == AbstractC2418i.f8811A4) {
                    aVar = a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == AbstractC2418i.f8835D4) {
                    aVar = a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == AbstractC2418i.f8827C4) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                aVar2 = aVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new C2411b(string, aVar2, objValueOf2, z7));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: c */
    public static void m10384c(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C2411b c2411b = (C2411b) map.get(str);
            String str2 = c2411b.f8630a ? str : "set" + str;
            try {
                int iOrdinal = c2411b.f8632c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c2411b.f8633d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(c2411b.f8634e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c2411b.f8637h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c2411b.f8637h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c2411b.f8635f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c2411b.f8636g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(c2411b.f8634e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c2411b.f8633d));
                        break;
                }
            } catch (IllegalAccessException e7) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e7);
            } catch (NoSuchMethodException e8) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e8);
            } catch (InvocationTargetException e9) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e9);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m10385d(Object obj) {
        switch (this.f8632c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f8633d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f8634e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f8637h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f8635f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f8636g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f8634e = ((Float) obj).floatValue();
                break;
        }
    }

    public C2411b(C2411b c2411b, Object obj) {
        this.f8630a = false;
        this.f8631b = c2411b.f8631b;
        this.f8632c = c2411b.f8632c;
        m10385d(obj);
    }
}
