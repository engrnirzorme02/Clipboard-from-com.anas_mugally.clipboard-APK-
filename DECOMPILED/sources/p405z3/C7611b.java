package p405z3;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC2241b;
import androidx.appcompat.view.C2268d;
import p045F3.AbstractC0422b;
import p069I3.C0622i;
import p093L3.AbstractC0842a;
import p255h.AbstractC5520a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: loaded from: classes2.dex */
public class C7611b extends DialogInterfaceC2241b.a {

    /* JADX INFO: renamed from: e */
    private static final int f30283e = AbstractC5520a.f20973k;

    /* JADX INFO: renamed from: f */
    private static final int f30284f = AbstractC6751l.f26536a;

    /* JADX INFO: renamed from: g */
    private static final int f30285g = AbstractC6742c.f26282v;

    /* JADX INFO: renamed from: c */
    private Drawable f30286c;

    /* JADX INFO: renamed from: d */
    private final Rect f30287d;

    public C7611b(Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: w */
    private static Context m33347w(Context context) {
        int iM33348x = m33348x(context);
        Context contextM3884d = AbstractC0842a.m3884d(context, null, f30283e, f30284f);
        return iM33348x == 0 ? contextM3884d : new C2268d(contextM3884d, iM33348x);
    }

    /* JADX INFO: renamed from: x */
    private static int m33348x(Context context) {
        TypedValue typedValueM1817a = AbstractC0422b.m1817a(context, f30285g);
        if (typedValueM1817a == null) {
            return 0;
        }
        return typedValueM1817a.data;
    }

    /* JADX INFO: renamed from: y */
    private static int m33349y(Context context, int i7) {
        return i7 == 0 ? m33348x(context) : i7;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C7611b mo9100d(boolean z7) {
        return (C7611b) super.mo9100d(z7);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public C7611b mo9101e(View view) {
        return (C7611b) super.mo9101e(view);
    }

    /* JADX INFO: renamed from: C */
    public C7611b m33352C(int i7) {
        return (C7611b) super.m9102f(i7);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C7611b mo9103g(Drawable drawable) {
        return (C7611b) super.mo9103g(drawable);
    }

    /* JADX INFO: renamed from: E */
    public C7611b m33354E(int i7) {
        return (C7611b) super.m9104h(i7);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C7611b mo9105i(CharSequence charSequence) {
        return (C7611b) super.mo9105i(charSequence);
    }

    /* JADX INFO: renamed from: G */
    public C7611b m33356G(int i7, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.m9106j(i7, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C7611b mo9107k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.mo9107k(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: I */
    public C7611b m33358I(int i7, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.m9108l(i7, onClickListener);
    }

    /* JADX INFO: renamed from: J */
    public C7611b m33359J(DialogInterface.OnDismissListener onDismissListener) {
        return (C7611b) super.m9109m(onDismissListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public C7611b mo9110n(DialogInterface.OnKeyListener onKeyListener) {
        return (C7611b) super.mo9110n(onKeyListener);
    }

    /* JADX INFO: renamed from: L */
    public C7611b m33361L(int i7, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.m9111o(i7, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public C7611b mo9112p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.mo9112p(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public C7611b mo9113q(ListAdapter listAdapter, int i7, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.mo9113q(listAdapter, i7, onClickListener);
    }

    /* JADX INFO: renamed from: O */
    public C7611b m33364O(CharSequence[] charSequenceArr, int i7, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.m9114r(charSequenceArr, i7, onClickListener);
    }

    /* JADX INFO: renamed from: P */
    public C7611b m33365P(int i7) {
        return (C7611b) super.m9115s(i7);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C7611b mo9116t(CharSequence charSequence) {
        return (C7611b) super.mo9116t(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public C7611b mo9117u(View view) {
        return (C7611b) super.mo9117u(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: a */
    public DialogInterfaceC2241b mo9097a() {
        DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = super.mo9097a();
        Window window = dialogInterfaceC2241bMo9097a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f30286c;
        if (drawable instanceof C0622i) {
            ((C0622i) drawable).m2717f0(decorView.getElevation());
        }
        window.setBackgroundDrawable(AbstractC7612c.m33370b(this.f30286c, this.f30287d));
        decorView.setOnTouchListener(new ViewOnTouchListenerC7610a(dialogInterfaceC2241bMo9097a, this.f30287d));
        return dialogInterfaceC2241bMo9097a;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC2241b.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C7611b mo9099c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (C7611b) super.mo9099c(listAdapter, onClickListener);
    }

    public C7611b(Context context, int i7) {
        super(m33347w(context), m33349y(context, i7));
        Context contextM9098b = m9098b();
        Resources.Theme theme = contextM9098b.getTheme();
        int i8 = f30283e;
        int i9 = f30284f;
        this.f30287d = AbstractC7612c.m33369a(contextM9098b, i8, i9);
        int iM33172c = AbstractC7539a.m33172c(contextM9098b, AbstractC6742c.f26262k, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = contextM9098b.obtainStyledAttributes(null, AbstractC6752m.f26686L2, i8, i9);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC6752m.f26741Q2, iM33172c);
        typedArrayObtainStyledAttributes.recycle();
        C0622i c0622i = new C0622i(contextM9098b, null, i8, i9);
        c0622i.m2710U(contextM9098b);
        c0622i.m2718g0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(m9098b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c0622i.m2714c0(dimension);
            }
        }
        this.f30286c = c0622i;
    }
}
