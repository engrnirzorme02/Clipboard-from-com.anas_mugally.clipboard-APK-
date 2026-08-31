package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AbstractC2358i0;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C2303B;
import p255h.AbstractC5529j;
import p295m.InterfaceC6318e;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C2303B implements InterfaceC2286k.a, View.OnClickListener, ActionMenuView.InterfaceC2298a {

    /* JADX INFO: renamed from: A */
    private int f7574A;

    /* JADX INFO: renamed from: B */
    private int f7575B;

    /* JADX INFO: renamed from: C */
    private int f7576C;

    /* JADX INFO: renamed from: s */
    C2282g f7577s;

    /* JADX INFO: renamed from: t */
    private CharSequence f7578t;

    /* JADX INFO: renamed from: u */
    private Drawable f7579u;

    /* JADX INFO: renamed from: v */
    C2280e.b f7580v;

    /* JADX INFO: renamed from: w */
    private AbstractViewOnTouchListenerC2318P f7581w;

    /* JADX INFO: renamed from: x */
    AbstractC2275b f7582x;

    /* JADX INFO: renamed from: y */
    private boolean f7583y;

    /* JADX INFO: renamed from: z */
    private boolean f7584z;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C2274a extends AbstractViewOnTouchListenerC2318P {
        public C2274a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P
        /* JADX INFO: renamed from: b */
        public InterfaceC6318e mo9419b() {
            AbstractC2275b abstractC2275b = ActionMenuItemView.this.f7582x;
            if (abstractC2275b != null) {
                return abstractC2275b.mo9421a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P
        /* JADX INFO: renamed from: c */
        protected boolean mo9420c() {
            InterfaceC6318e interfaceC6318eMo9419b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C2280e.b bVar = actionMenuItemView.f7580v;
            return bVar != null && bVar.mo9422a(actionMenuItemView.f7577s) && (interfaceC6318eMo9419b = mo9419b()) != null && interfaceC6318eMo9419b.mo9453a();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC2275b {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC6318e mo9421a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: t */
    private boolean m9412t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i8 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    private void m9413u() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f7578t);
        if (this.f7579u != null && (!this.f7577s.m9547B() || (!this.f7583y && !this.f7584z))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f7578t : null);
        CharSequence contentDescription = this.f7577s.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z9 ? null : this.f7577s.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f7577s.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            AbstractC2358i0.m10085a(this, z9 ? null : this.f7577s.getTitle());
        } else {
            AbstractC2358i0.m10085a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC2298a
    /* JADX INFO: renamed from: a */
    public boolean mo9414a() {
        return m9418s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC2298a
    /* JADX INFO: renamed from: b */
    public boolean mo9415b() {
        return m9418s() && this.f7577s.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    /* JADX INFO: renamed from: d */
    public boolean mo9416d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    /* JADX INFO: renamed from: e */
    public void mo9417e(C2282g c2282g, int i7) {
        this.f7577s = c2282g;
        setIcon(c2282g.getIcon());
        setTitle(c2282g.m9552i(this));
        setId(c2282g.getItemId());
        setVisibility(c2282g.isVisible() ? 0 : 8);
        setEnabled(c2282g.isEnabled());
        if (c2282g.hasSubMenu() && this.f7581w == null) {
            this.f7581w = new C2274a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    public C2282g getItemData() {
        return this.f7577s;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C2280e.b bVar = this.f7580v;
        if (bVar != null) {
            bVar.mo9422a(this.f7577s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7583y = m9412t();
        m9413u();
    }

    @Override // androidx.appcompat.widget.C2303B, android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        boolean zM9418s = m9418s();
        if (zM9418s && (i9 = this.f7575B) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f7574A) : this.f7574A;
        if (mode != 1073741824 && this.f7574A > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i8);
        }
        if (zM9418s || this.f7579u == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f7579u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC2318P abstractViewOnTouchListenerC2318P;
        if (this.f7577s.hasSubMenu() && (abstractViewOnTouchListenerC2318P = this.f7581w) != null && abstractViewOnTouchListenerC2318P.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public boolean m9418s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f7584z != z7) {
            this.f7584z = z7;
            C2282g c2282g = this.f7577s;
            if (c2282g != null) {
                c2282g.m9548c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7579u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f7576C;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        m9413u();
    }

    public void setItemInvoker(C2280e.b bVar) {
        this.f7580v = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        this.f7575B = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC2275b abstractC2275b) {
        this.f7582x = abstractC2275b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7578t = charSequence;
        m9413u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f7583y = m9412t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5529j.f21330v, i7, 0);
        this.f7574A = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5529j.f21335w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f7576C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f7575B = -1;
        setSaveEnabled(false);
    }
}
