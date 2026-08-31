package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC2241b;
import androidx.appcompat.view.C2268d;
import p104N.AbstractC0905b;
import p255h.AbstractC5520a;
import p255h.AbstractC5526g;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;
import p295m.InterfaceC6318e;

/* JADX INFO: renamed from: androidx.appcompat.widget.y */
/* JADX INFO: loaded from: classes.dex */
public class C2376y extends Spinner {

    /* JADX INFO: renamed from: t */
    private static final int[] f8326t = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    private final C2349e f8327a;

    /* JADX INFO: renamed from: b */
    private final Context f8328b;

    /* JADX INFO: renamed from: c */
    private AbstractViewOnTouchListenerC2318P f8329c;

    /* JADX INFO: renamed from: d */
    private SpinnerAdapter f8330d;

    /* JADX INFO: renamed from: e */
    private final boolean f8331e;

    /* JADX INFO: renamed from: f */
    private h f8332f;

    /* JADX INFO: renamed from: r */
    int f8333r;

    /* JADX INFO: renamed from: s */
    final Rect f8334s;

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$a */
    class a extends AbstractViewOnTouchListenerC2318P {

        /* JADX INFO: renamed from: u */
        final /* synthetic */ f f8335u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f8335u = fVar;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P
        /* JADX INFO: renamed from: b */
        public InterfaceC6318e mo9419b() {
            return this.f8335u;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P
        /* JADX INFO: renamed from: c */
        public boolean mo9420c() {
            if (C2376y.this.getInternalPopup().mo10161a()) {
                return true;
            }
            C2376y.this.m10159b();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$b */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C2376y.this.getInternalPopup().mo10161a()) {
                C2376y.this.m10159b();
            }
            ViewTreeObserver viewTreeObserver = C2376y.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$c */
    private static final class c {
        /* JADX INFO: renamed from: a */
        static void m10160a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (AbstractC0905b.m4125a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$d */
    class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        DialogInterfaceC2241b f8338a;

        /* JADX INFO: renamed from: b */
        private ListAdapter f8339b;

        /* JADX INFO: renamed from: c */
        private CharSequence f8340c;

        d() {
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: a */
        public boolean mo10161a() {
            DialogInterfaceC2241b dialogInterfaceC2241b = this.f8338a;
            if (dialogInterfaceC2241b != null) {
                return dialogInterfaceC2241b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: c */
        public Drawable mo10162c() {
            return null;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: d */
        public void mo10163d(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C2376y.h
        public void dismiss() {
            DialogInterfaceC2241b dialogInterfaceC2241b = this.f8338a;
            if (dialogInterfaceC2241b != null) {
                dialogInterfaceC2241b.dismiss();
                this.f8338a = null;
            }
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: e */
        public int mo10164e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: g */
        public void mo10165g(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: h */
        public CharSequence mo10166h() {
            return this.f8340c;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: j */
        public void mo10167j(CharSequence charSequence) {
            this.f8340c = charSequence;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: l */
        public void mo10168l(int i7) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: m */
        public void mo10169m(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: n */
        public void mo10170n(int i7, int i8) {
            if (this.f8339b == null) {
                return;
            }
            DialogInterfaceC2241b.a aVar = new DialogInterfaceC2241b.a(C2376y.this.getPopupContext());
            CharSequence charSequence = this.f8340c;
            if (charSequence != null) {
                aVar.mo9116t(charSequence);
            }
            DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = aVar.mo9113q(this.f8339b, C2376y.this.getSelectedItemPosition(), this).mo9097a();
            this.f8338a = dialogInterfaceC2241bMo9097a;
            ListView listViewM9096l = dialogInterfaceC2241bMo9097a.m9096l();
            listViewM9096l.setTextDirection(i7);
            listViewM9096l.setTextAlignment(i8);
            this.f8338a.show();
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: o */
        public int mo10171o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            C2376y.this.setSelection(i7);
            if (C2376y.this.getOnItemClickListener() != null) {
                C2376y.this.performItemClick(null, i7, this.f8339b.getItemId(i7));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: p */
        public void mo9851p(ListAdapter listAdapter) {
            this.f8339b = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$e */
    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        private SpinnerAdapter f8342a;

        /* JADX INFO: renamed from: b */
        private ListAdapter f8343b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f8342a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f8343b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.m10160a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f8343b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f8342a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f8342a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i7) {
            SpinnerAdapter spinnerAdapter = this.f8342a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i7);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            SpinnerAdapter spinnerAdapter = this.f8342a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i7);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i7) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            return getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f8342a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i7) {
            ListAdapter listAdapter = this.f8343b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i7);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8342a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8342a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$f */
    class f extends C2320S implements h {

        /* JADX INFO: renamed from: T */
        private CharSequence f8344T;

        /* JADX INFO: renamed from: U */
        ListAdapter f8345U;

        /* JADX INFO: renamed from: V */
        private final Rect f8346V;

        /* JADX INFO: renamed from: W */
        private int f8347W;

        /* JADX INFO: renamed from: androidx.appcompat.widget.y$f$a */
        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C2376y f8349a;

            a(C2376y c2376y) {
                this.f8349a = c2376y;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                C2376y.this.setSelection(i7);
                if (C2376y.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    C2376y.this.performItemClick(view, i7, fVar.f8345U.getItemId(i7));
                }
                f.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.y$f$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.m10175V(C2376y.this)) {
                    f.this.dismiss();
                } else {
                    f.this.m10173T();
                    f.super.mo9454b();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.y$f$c */
        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f8352a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f8352a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C2376y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f8352a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f8346V = new Rect();
            m9831D(C2376y.this);
            m9837J(true);
            m9842P(0);
            m9839L(new a(C2376y.this));
        }

        /* JADX INFO: renamed from: T */
        void m10173T() {
            int i7;
            Drawable drawableM9845c = m9845c();
            if (drawableM9845c != null) {
                drawableM9845c.getPadding(C2376y.this.f8334s);
                i7 = AbstractC2362k0.m10112b(C2376y.this) ? C2376y.this.f8334s.right : -C2376y.this.f8334s.left;
            } else {
                Rect rect = C2376y.this.f8334s;
                rect.right = 0;
                rect.left = 0;
                i7 = 0;
            }
            int paddingLeft = C2376y.this.getPaddingLeft();
            int paddingRight = C2376y.this.getPaddingRight();
            int width = C2376y.this.getWidth();
            C2376y c2376y = C2376y.this;
            int i8 = c2376y.f8333r;
            if (i8 == -2) {
                int iM10158a = c2376y.m10158a((SpinnerAdapter) this.f8345U, m9845c());
                int i9 = C2376y.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C2376y.this.f8334s;
                int i10 = (i9 - rect2.left) - rect2.right;
                if (iM10158a > i10) {
                    iM10158a = i10;
                }
                m9833F(Math.max(iM10158a, (width - paddingLeft) - paddingRight));
            } else if (i8 == -1) {
                m9833F((width - paddingLeft) - paddingRight);
            } else {
                m9833F(i8);
            }
            m9848g(AbstractC2362k0.m10112b(C2376y.this) ? i7 + (((width - paddingRight) - m9859z()) - m10174U()) : i7 + paddingLeft + m10174U());
        }

        /* JADX INFO: renamed from: U */
        public int m10174U() {
            return this.f8347W;
        }

        /* JADX INFO: renamed from: V */
        boolean m10175V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f8346V);
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: h */
        public CharSequence mo10166h() {
            return this.f8344T;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: j */
        public void mo10167j(CharSequence charSequence) {
            this.f8344T = charSequence;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: m */
        public void mo10169m(int i7) {
            this.f8347W = i7;
        }

        @Override // androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: n */
        public void mo10170n(int i7, int i8) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo9453a = mo9453a();
            m10173T();
            m9836I(2);
            super.mo9454b();
            ListView listViewMo9457k = mo9457k();
            listViewMo9457k.setChoiceMode(1);
            listViewMo9457k.setTextDirection(i7);
            listViewMo9457k.setTextAlignment(i8);
            m9843Q(C2376y.this.getSelectedItemPosition());
            if (zMo9453a || (viewTreeObserver = C2376y.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m9838K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.C2320S, androidx.appcompat.widget.C2376y.h
        /* JADX INFO: renamed from: p */
        public void mo9851p(ListAdapter listAdapter) {
            super.mo9851p(listAdapter);
            this.f8345U = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$g */
    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        boolean f8354a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.y$g$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f8354a ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f8354a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$h */
    interface h {
        /* JADX INFO: renamed from: a */
        boolean mo10161a();

        /* JADX INFO: renamed from: c */
        Drawable mo10162c();

        /* JADX INFO: renamed from: d */
        void mo10163d(Drawable drawable);

        void dismiss();

        /* JADX INFO: renamed from: e */
        int mo10164e();

        /* JADX INFO: renamed from: g */
        void mo10165g(int i7);

        /* JADX INFO: renamed from: h */
        CharSequence mo10166h();

        /* JADX INFO: renamed from: j */
        void mo10167j(CharSequence charSequence);

        /* JADX INFO: renamed from: l */
        void mo10168l(int i7);

        /* JADX INFO: renamed from: m */
        void mo10169m(int i7);

        /* JADX INFO: renamed from: n */
        void mo10170n(int i7, int i8);

        /* JADX INFO: renamed from: o */
        int mo10171o();

        /* JADX INFO: renamed from: p */
        void mo9851p(ListAdapter listAdapter);
    }

    public C2376y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20958I);
    }

    /* JADX INFO: renamed from: a */
    int m10158a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f8334s);
        Rect rect = this.f8334s;
        return iMax2 + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: b */
    void m10159b() {
        this.f8332f.mo10170n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2349e c2349e = this.f8327a;
        if (c2349e != null) {
            c2349e.m10049b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f8332f;
        return hVar != null ? hVar.mo10164e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f8332f;
        return hVar != null ? hVar.mo10171o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8332f != null ? this.f8333r : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f8332f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f8332f;
        return hVar != null ? hVar.mo10162c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8328b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f8332f;
        return hVar != null ? hVar.mo10166h() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f8327a;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f8327a;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f8332f;
        if (hVar == null || !hVar.mo10161a()) {
            return;
        }
        this.f8332f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f8332f == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m10158a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f8354a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f8332f;
        gVar.f8354a = hVar != null && hVar.mo10161a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC2318P abstractViewOnTouchListenerC2318P = this.f8329c;
        if (abstractViewOnTouchListenerC2318P == null || !abstractViewOnTouchListenerC2318P.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f8332f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.mo10161a()) {
            return true;
        }
        m10159b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f8327a;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f8327a;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        h hVar = this.f8332f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            hVar.mo10169m(i7);
            this.f8332f.mo10165g(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        h hVar = this.f8332f;
        if (hVar != null) {
            hVar.mo10168l(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f8332f != null) {
            this.f8333r = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f8332f;
        if (hVar != null) {
            hVar.mo10163d(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(AbstractC5659a.m25175b(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f8332f;
        if (hVar != null) {
            hVar.mo10167j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f8327a;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f8327a;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public C2376y(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8331e) {
            this.f8330d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f8332f != null) {
            Context context = this.f8328b;
            if (context == null) {
                context = getContext();
            }
            this.f8332f.mo9851p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public C2376y(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(context, attributeSet, i7, i8, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.y] */
    public C2376y(Context context, AttributeSet attributeSet, int i7, int i8, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM10042q;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i7);
        this.f8334s = new Rect();
        AbstractC2340Z.m9984a(this, getContext());
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, AbstractC5529j.f21258g2, i7, 0);
        this.f8327a = new C2349e(this);
        if (theme != null) {
            this.f8328b = new C2268d(context, theme);
        } else {
            int iM10039n = c2348d0M10025v.m10039n(AbstractC5529j.f21283l2, 0);
            if (iM10039n != 0) {
                this.f8328b = new C2268d(context, iM10039n);
            } else {
                this.f8328b = context;
            }
        }
        ?? r11 = -1;
        ?? r7 = 0;
        try {
            if (i8 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8326t, i7, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i8 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i8 != 0) {
                            d dVar = new d();
                            this.f8332f = dVar;
                            dVar.mo10167j(c2348d0M10025v.m10040o(AbstractC5529j.f21273j2));
                        } else if (i8 == 1) {
                            f fVar = new f(this.f8328b, attributeSet, i7);
                            C2348d0 c2348d0M10025v2 = C2348d0.m10025v(this.f8328b, attributeSet, AbstractC5529j.f21258g2, i7, 0);
                            this.f8333r = c2348d0M10025v2.m10038m(AbstractC5529j.f21278k2, -2);
                            fVar.m9846d(c2348d0M10025v2.m10032g(AbstractC5529j.f21268i2));
                            fVar.mo10167j(c2348d0M10025v.m10040o(AbstractC5529j.f21273j2));
                            c2348d0M10025v2.m10046x();
                            this.f8332f = fVar;
                            this.f8329c = new a(this, fVar);
                        }
                        charSequenceArrM10042q = c2348d0M10025v.m10042q(AbstractC5529j.f21263h2);
                        if (charSequenceArrM10042q != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM10042q);
                            arrayAdapter.setDropDownViewResource(AbstractC5526g.f21095q);
                            setAdapter(arrayAdapter);
                        }
                        c2348d0M10025v.m10046x();
                        this.f8331e = true;
                        spinnerAdapter = this.f8330d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f8330d = null;
                        }
                        this.f8327a.m10052e(attributeSet, i7);
                    }
                } catch (Exception e8) {
                    e = e8;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r7 != 0) {
                        r7.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i8 != 0) {
                d dVar2 = new d();
                this.f8332f = dVar2;
                dVar2.mo10167j(c2348d0M10025v.m10040o(AbstractC5529j.f21273j2));
            } else if (i8 == 1) {
                f fVar2 = new f(this.f8328b, attributeSet, i7);
                C2348d0 c2348d0M10025v3 = C2348d0.m10025v(this.f8328b, attributeSet, AbstractC5529j.f21258g2, i7, 0);
                this.f8333r = c2348d0M10025v3.m10038m(AbstractC5529j.f21278k2, -2);
                fVar2.m9846d(c2348d0M10025v3.m10032g(AbstractC5529j.f21268i2));
                fVar2.mo10167j(c2348d0M10025v.m10040o(AbstractC5529j.f21273j2));
                c2348d0M10025v3.m10046x();
                this.f8332f = fVar2;
                this.f8329c = new a(this, fVar2);
            }
            charSequenceArrM10042q = c2348d0M10025v.m10042q(AbstractC5529j.f21263h2);
            if (charSequenceArrM10042q != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM10042q);
                arrayAdapter2.setDropDownViewResource(AbstractC5526g.f21095q);
                setAdapter(arrayAdapter2);
            }
            c2348d0M10025v.m10046x();
            this.f8331e = true;
            spinnerAdapter = this.f8330d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f8330d = null;
            }
            this.f8327a.m10052e(attributeSet, i7);
        } catch (Throwable th2) {
            th = th2;
            r7 = r11;
        }
    }
}
