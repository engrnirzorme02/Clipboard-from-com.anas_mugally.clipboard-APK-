package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.C2348d0;
import p255h.AbstractC5520a;
import p255h.AbstractC5525f;
import p255h.AbstractC5526g;
import p255h.AbstractC5529j;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC2286k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A */
    private LayoutInflater f7589A;

    /* JADX INFO: renamed from: B */
    private boolean f7590B;

    /* JADX INFO: renamed from: a */
    private C2282g f7591a;

    /* JADX INFO: renamed from: b */
    private ImageView f7592b;

    /* JADX INFO: renamed from: c */
    private RadioButton f7593c;

    /* JADX INFO: renamed from: d */
    private TextView f7594d;

    /* JADX INFO: renamed from: e */
    private CheckBox f7595e;

    /* JADX INFO: renamed from: f */
    private TextView f7596f;

    /* JADX INFO: renamed from: r */
    private ImageView f7597r;

    /* JADX INFO: renamed from: s */
    private ImageView f7598s;

    /* JADX INFO: renamed from: t */
    private LinearLayout f7599t;

    /* JADX INFO: renamed from: u */
    private Drawable f7600u;

    /* JADX INFO: renamed from: v */
    private int f7601v;

    /* JADX INFO: renamed from: w */
    private Context f7602w;

    /* JADX INFO: renamed from: x */
    private boolean f7603x;

    /* JADX INFO: renamed from: y */
    private Drawable f7604y;

    /* JADX INFO: renamed from: z */
    private boolean f7605z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20952C);
    }

    /* JADX INFO: renamed from: a */
    private void m9424a(View view) {
        m9425b(view, -1);
    }

    /* JADX INFO: renamed from: b */
    private void m9425b(View view, int i7) {
        LinearLayout linearLayout = this.f7599t;
        if (linearLayout != null) {
            linearLayout.addView(view, i7);
        } else {
            addView(view, i7);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m9426c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC5526g.f21086h, (ViewGroup) this, false);
        this.f7595e = checkBox;
        m9424a(checkBox);
    }

    /* JADX INFO: renamed from: f */
    private void m9427f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC5526g.f21087i, (ViewGroup) this, false);
        this.f7592b = imageView;
        m9425b(imageView, 0);
    }

    /* JADX INFO: renamed from: g */
    private void m9428g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC5526g.f21089k, (ViewGroup) this, false);
        this.f7593c = radioButton;
        m9424a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f7589A == null) {
            this.f7589A = LayoutInflater.from(getContext());
        }
        return this.f7589A;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f7597r;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f7598s;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7598s.getLayoutParams();
        rect.top += this.f7598s.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    /* JADX INFO: renamed from: d */
    public boolean mo9416d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    /* JADX INFO: renamed from: e */
    public void mo9417e(C2282g c2282g, int i7) {
        this.f7591a = c2282g;
        setVisibility(c2282g.isVisible() ? 0 : 8);
        setTitle(c2282g.m9552i(this));
        setCheckable(c2282g.isCheckable());
        m9429h(c2282g.m9546A(), c2282g.m9550g());
        setIcon(c2282g.getIcon());
        setEnabled(c2282g.isEnabled());
        setSubMenuArrowVisible(c2282g.hasSubMenu());
        setContentDescription(c2282g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k.a
    public C2282g getItemData() {
        return this.f7591a;
    }

    /* JADX INFO: renamed from: h */
    public void m9429h(boolean z7, char c7) {
        int i7 = (z7 && this.f7591a.m9546A()) ? 0 : 8;
        if (i7 == 0) {
            this.f7596f.setText(this.f7591a.m9551h());
        }
        if (this.f7596f.getVisibility() != i7) {
            this.f7596f.setVisibility(i7);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f7600u);
        TextView textView = (TextView) findViewById(AbstractC5525f.f21049B);
        this.f7594d = textView;
        int i7 = this.f7601v;
        if (i7 != -1) {
            textView.setTextAppearance(this.f7602w, i7);
        }
        this.f7596f = (TextView) findViewById(AbstractC5525f.f21074v);
        ImageView imageView = (ImageView) findViewById(AbstractC5525f.f21077y);
        this.f7597r = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7604y);
        }
        this.f7598s = (ImageView) findViewById(AbstractC5525f.f21069q);
        this.f7599t = (LinearLayout) findViewById(AbstractC5525f.f21064l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f7592b != null && this.f7603x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7592b.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f7593c == null && this.f7595e == null) {
            return;
        }
        if (this.f7591a.m9556m()) {
            if (this.f7593c == null) {
                m9428g();
            }
            compoundButton = this.f7593c;
            view = this.f7595e;
        } else {
            if (this.f7595e == null) {
                m9426c();
            }
            compoundButton = this.f7595e;
            view = this.f7593c;
        }
        if (z7) {
            compoundButton.setChecked(this.f7591a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f7595e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f7593c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if (this.f7591a.m9556m()) {
            if (this.f7593c == null) {
                m9428g();
            }
            compoundButton = this.f7593c;
        } else {
            if (this.f7595e == null) {
                m9426c();
            }
            compoundButton = this.f7595e;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f7590B = z7;
        this.f7603x = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f7598s;
        if (imageView != null) {
            imageView.setVisibility((this.f7605z || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z7 = this.f7591a.m9569z() || this.f7590B;
        if (z7 || this.f7603x) {
            ImageView imageView = this.f7592b;
            if (imageView == null && drawable == null && !this.f7603x) {
                return;
            }
            if (imageView == null) {
                m9427f();
            }
            if (drawable == null && !this.f7603x) {
                this.f7592b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f7592b;
            if (!z7) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f7592b.getVisibility() != 0) {
                this.f7592b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f7594d.getVisibility() != 8) {
                this.f7594d.setVisibility(8);
            }
        } else {
            this.f7594d.setText(charSequence);
            if (this.f7594d.getVisibility() != 0) {
                this.f7594d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        C2348d0 c2348d0M10025v = C2348d0.m10025v(getContext(), attributeSet, AbstractC5529j.f21199T1, i7, 0);
        this.f7600u = c2348d0M10025v.m10032g(AbstractC5529j.f21207V1);
        this.f7601v = c2348d0M10025v.m10039n(AbstractC5529j.f21203U1, -1);
        this.f7603x = c2348d0M10025v.m10026a(AbstractC5529j.f21211W1, false);
        this.f7602w = context;
        this.f7604y = c2348d0M10025v.m10032g(AbstractC5529j.f21215X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC5520a.f20988z, 0);
        this.f7605z = typedArrayObtainStyledAttributes.hasValue(0);
        c2348d0M10025v.m10046x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
