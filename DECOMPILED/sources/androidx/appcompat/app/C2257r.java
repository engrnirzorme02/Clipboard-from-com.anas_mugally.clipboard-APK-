package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C2268d;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C2303B;
import androidx.appcompat.widget.C2308F;
import androidx.appcompat.widget.C2342a0;
import androidx.appcompat.widget.C2347d;
import androidx.appcompat.widget.C2351f;
import androidx.appcompat.widget.C2353g;
import androidx.appcompat.widget.C2361k;
import androidx.appcompat.widget.C2366o;
import androidx.appcompat.widget.C2368q;
import androidx.appcompat.widget.C2371t;
import androidx.appcompat.widget.C2372u;
import androidx.appcompat.widget.C2374w;
import androidx.appcompat.widget.C2376y;
import androidx.collection.C2400k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p111O.AbstractC1030Z;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.app.r */
/* JADX INFO: loaded from: classes.dex */
public class C2257r {

    /* JADX INFO: renamed from: b */
    private static final Class[] f7439b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    private static final int[] f7440c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    private static final int[] f7441d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    private static final int[] f7442e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    private static final int[] f7443f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    private static final String[] f7444g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    private static final C2400k f7445h = new C2400k();

    /* JADX INFO: renamed from: a */
    private final Object[] f7446a = new Object[2];

    /* JADX INFO: renamed from: androidx.appcompat.app.r$a */
    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        private final View f7447a;

        /* JADX INFO: renamed from: b */
        private final String f7448b;

        /* JADX INFO: renamed from: c */
        private Method f7449c;

        /* JADX INFO: renamed from: d */
        private Context f7450d;

        public a(View view, String str) {
            this.f7447a = view;
            this.f7448b = str;
        }

        /* JADX INFO: renamed from: a */
        private void m9311a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f7448b, View.class)) != null) {
                        this.f7449c = method;
                        this.f7450d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f7447a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f7447a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f7448b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f7447a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f7449c == null) {
                m9311a(this.f7447a.getContext());
            }
            try {
                this.f7449c.invoke(this.f7450d, view);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException("Could not execute method for android:onClick", e8);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9289a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7441d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            AbstractC1030Z.m4476k0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f7442e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            AbstractC1030Z.m4478l0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f7443f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            AbstractC1030Z.m4498v0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    /* JADX INFO: renamed from: b */
    private void m9290b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7440c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: s */
    private View m9291s(Context context, String str, String str2) {
        String str3;
        C2400k c2400k = f7445h;
        Constructor constructor = (Constructor) c2400k.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f7439b);
            c2400k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f7446a);
    }

    /* JADX INFO: renamed from: t */
    private View m9292t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f7446a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m9291s(context, str, null);
            }
            int i7 = 0;
            while (true) {
                String[] strArr = f7444g;
                if (i7 >= strArr.length) {
                    return null;
                }
                View viewM9291s = m9291s(context, str, strArr[i7]);
                if (viewM9291s != null) {
                    return viewM9291s;
                }
                i7++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f7446a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* JADX INFO: renamed from: u */
    private static Context m9293u(Context context, AttributeSet attributeSet, boolean z7, boolean z8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5529j.f21339w3, 0, 0);
        int resourceId = z7 ? typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21344x3, 0) : 0;
        if (z8 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21349y3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof C2268d) && ((C2268d) context).m9382c() == resourceId)) ? context : new C2268d(context, resourceId);
    }

    /* JADX INFO: renamed from: v */
    private void m9294v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* JADX INFO: renamed from: c */
    protected C2347d mo9295c(Context context, AttributeSet attributeSet) {
        return new C2347d(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    protected AppCompatButton mo9296d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    protected C2351f mo9297e(Context context, AttributeSet attributeSet) {
        return new C2351f(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    protected C2353g m9298f(Context context, AttributeSet attributeSet) {
        return new C2353g(context, attributeSet);
    }

    /* JADX INFO: renamed from: g */
    protected C2361k m9299g(Context context, AttributeSet attributeSet) {
        return new C2361k(context, attributeSet);
    }

    /* JADX INFO: renamed from: h */
    protected C2366o m9300h(Context context, AttributeSet attributeSet) {
        return new C2366o(context, attributeSet);
    }

    /* JADX INFO: renamed from: i */
    protected AppCompatImageView m9301i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* JADX INFO: renamed from: j */
    protected C2368q m9302j(Context context, AttributeSet attributeSet) {
        return new C2368q(context, attributeSet);
    }

    /* JADX INFO: renamed from: k */
    protected C2371t mo9303k(Context context, AttributeSet attributeSet) {
        return new C2371t(context, attributeSet);
    }

    /* JADX INFO: renamed from: l */
    protected C2372u m9304l(Context context, AttributeSet attributeSet) {
        return new C2372u(context, attributeSet);
    }

    /* JADX INFO: renamed from: m */
    protected C2374w m9305m(Context context, AttributeSet attributeSet) {
        return new C2374w(context, attributeSet);
    }

    /* JADX INFO: renamed from: n */
    protected C2376y m9306n(Context context, AttributeSet attributeSet) {
        return new C2376y(context, attributeSet);
    }

    /* JADX INFO: renamed from: o */
    protected C2303B mo9307o(Context context, AttributeSet attributeSet) {
        return new C2303B(context, attributeSet);
    }

    /* JADX INFO: renamed from: p */
    protected C2308F m9308p(Context context, AttributeSet attributeSet) {
        return new C2308F(context, attributeSet);
    }

    /* JADX INFO: renamed from: q */
    protected View m9309q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final View m9310r(View view, String str, Context context, AttributeSet attributeSet, boolean z7, boolean z8, boolean z9, boolean z10) {
        View viewM9304l;
        Context context2 = (!z7 || view == null) ? context : view.getContext();
        if (z8 || z9) {
            context2 = m9293u(context2, attributeSet, z8, z9);
        }
        if (z10) {
            context2 = C2342a0.m9997b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewM9304l = m9304l(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "CheckedTextView":
                viewM9304l = m9298f(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "MultiAutoCompleteTextView":
                viewM9304l = m9302j(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "TextView":
                viewM9304l = mo9307o(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "ImageButton":
                viewM9304l = m9300h(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "SeekBar":
                viewM9304l = m9305m(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "Spinner":
                viewM9304l = m9306n(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "RadioButton":
                viewM9304l = mo9303k(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "ToggleButton":
                viewM9304l = m9308p(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "ImageView":
                viewM9304l = m9301i(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "AutoCompleteTextView":
                viewM9304l = mo9295c(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "CheckBox":
                viewM9304l = mo9297e(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "EditText":
                viewM9304l = m9299g(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            case "Button":
                viewM9304l = mo9296d(context2, attributeSet);
                m9294v(viewM9304l, str);
                break;
            default:
                viewM9304l = m9309q(context2, str, attributeSet);
                break;
        }
        if (viewM9304l == null && context != context2) {
            viewM9304l = m9292t(context2, str, attributeSet);
        }
        if (viewM9304l != null) {
            m9290b(viewM9304l, attributeSet);
            m9289a(context2, viewM9304l, attributeSet);
        }
        return viewM9304l;
    }
}
