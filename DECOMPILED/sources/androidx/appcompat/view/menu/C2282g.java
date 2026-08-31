package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p041F.AbstractC0400a;
import p057H.InterfaceMenuItemC0492b;
import p111O.AbstractC1035b;
import p255h.AbstractC5527h;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2282g implements InterfaceMenuItemC0492b {

    /* JADX INFO: renamed from: A */
    private View f7702A;

    /* JADX INFO: renamed from: B */
    private AbstractC1035b f7703B;

    /* JADX INFO: renamed from: C */
    private MenuItem.OnActionExpandListener f7704C;

    /* JADX INFO: renamed from: E */
    private ContextMenu.ContextMenuInfo f7706E;

    /* JADX INFO: renamed from: a */
    private final int f7707a;

    /* JADX INFO: renamed from: b */
    private final int f7708b;

    /* JADX INFO: renamed from: c */
    private final int f7709c;

    /* JADX INFO: renamed from: d */
    private final int f7710d;

    /* JADX INFO: renamed from: e */
    private CharSequence f7711e;

    /* JADX INFO: renamed from: f */
    private CharSequence f7712f;

    /* JADX INFO: renamed from: g */
    private Intent f7713g;

    /* JADX INFO: renamed from: h */
    private char f7714h;

    /* JADX INFO: renamed from: j */
    private char f7716j;

    /* JADX INFO: renamed from: l */
    private Drawable f7718l;

    /* JADX INFO: renamed from: n */
    C2280e f7720n;

    /* JADX INFO: renamed from: o */
    private SubMenuC2288m f7721o;

    /* JADX INFO: renamed from: p */
    private Runnable f7722p;

    /* JADX INFO: renamed from: q */
    private MenuItem.OnMenuItemClickListener f7723q;

    /* JADX INFO: renamed from: r */
    private CharSequence f7724r;

    /* JADX INFO: renamed from: s */
    private CharSequence f7725s;

    /* JADX INFO: renamed from: z */
    private int f7732z;

    /* JADX INFO: renamed from: i */
    private int f7715i = 4096;

    /* JADX INFO: renamed from: k */
    private int f7717k = 4096;

    /* JADX INFO: renamed from: m */
    private int f7719m = 0;

    /* JADX INFO: renamed from: t */
    private ColorStateList f7726t = null;

    /* JADX INFO: renamed from: u */
    private PorterDuff.Mode f7727u = null;

    /* JADX INFO: renamed from: v */
    private boolean f7728v = false;

    /* JADX INFO: renamed from: w */
    private boolean f7729w = false;

    /* JADX INFO: renamed from: x */
    private boolean f7730x = false;

    /* JADX INFO: renamed from: y */
    private int f7731y = 16;

    /* JADX INFO: renamed from: D */
    private boolean f7705D = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.g$a */
    class a implements AbstractC1035b.b {
        a() {
        }

        @Override // p111O.AbstractC1035b.b
        public void onActionProviderVisibilityChanged(boolean z7) {
            C2282g c2282g = C2282g.this;
            c2282g.f7720n.m9502M(c2282g);
        }
    }

    C2282g(C2280e c2280e, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f7720n = c2280e;
        this.f7707a = i8;
        this.f7708b = i7;
        this.f7709c = i9;
        this.f7710d = i10;
        this.f7711e = charSequence;
        this.f7732z = i11;
    }

    /* JADX INFO: renamed from: d */
    private static void m9544d(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: e */
    private Drawable m9545e(Drawable drawable) {
        if (drawable != null && this.f7730x && (this.f7728v || this.f7729w)) {
            drawable = AbstractC0400a.m1712r(drawable).mutate();
            if (this.f7728v) {
                AbstractC0400a.m1709o(drawable, this.f7726t);
            }
            if (this.f7729w) {
                AbstractC0400a.m1710p(drawable, this.f7727u);
            }
            this.f7730x = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: A */
    boolean m9546A() {
        return this.f7720n.mo9500K() && m9550g() != 0;
    }

    /* JADX INFO: renamed from: B */
    public boolean m9547B() {
        return (this.f7732z & 4) == 4;
    }

    @Override // p057H.InterfaceMenuItemC0492b
    /* JADX INFO: renamed from: a */
    public InterfaceMenuItemC0492b mo2091a(AbstractC1035b abstractC1035b) {
        AbstractC1035b abstractC1035b2 = this.f7703B;
        if (abstractC1035b2 != null) {
            abstractC1035b2.m4616g();
        }
        this.f7702A = null;
        this.f7703B = abstractC1035b;
        this.f7720n.mo9503N(true);
        AbstractC1035b abstractC1035b3 = this.f7703B;
        if (abstractC1035b3 != null) {
            abstractC1035b3.mo4618i(new a());
        }
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b
    /* JADX INFO: renamed from: b */
    public AbstractC1035b mo2092b() {
        return this.f7703B;
    }

    /* JADX INFO: renamed from: c */
    public void m9548c() {
        this.f7720n.m9501L(this);
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f7732z & 8) == 0) {
            return false;
        }
        if (this.f7702A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7704C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7720n.mo9524f(this);
        }
        return false;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m9553j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7704C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7720n.mo9529m(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m9549f() {
        return this.f7710d;
    }

    /* JADX INFO: renamed from: g */
    char m9550g() {
        return this.f7720n.mo9499J() ? this.f7716j : this.f7714h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public View getActionView() {
        View view = this.f7702A;
        if (view != null) {
            return view;
        }
        AbstractC1035b abstractC1035b = this.f7703B;
        if (abstractC1035b == null) {
            return null;
        }
        View viewMo4612c = abstractC1035b.mo4612c(this);
        this.f7702A = viewMo4612c;
        return viewMo4612c;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f7717k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f7716j;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f7724r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f7708b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f7718l;
        if (drawable != null) {
            return m9545e(drawable);
        }
        if (this.f7719m == 0) {
            return null;
        }
        Drawable drawableM25175b = AbstractC5659a.m25175b(this.f7720n.m9538w(), this.f7719m);
        this.f7719m = 0;
        this.f7718l = drawableM25175b;
        return m9545e(drawableM25175b);
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f7726t;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f7727u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f7713g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f7707a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f7706E;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f7715i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f7714h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f7709c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f7721o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f7711e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7712f;
        return charSequence != null ? charSequence : this.f7711e;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f7725s;
    }

    /* JADX INFO: renamed from: h */
    String m9551h() {
        char cM9550g = m9550g();
        if (cM9550g == 0) {
            return "";
        }
        Resources resources = this.f7720n.m9538w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f7720n.m9538w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC5527h.f21108m));
        }
        int i7 = this.f7720n.mo9499J() ? this.f7717k : this.f7715i;
        m9544d(sb, i7, 65536, resources.getString(AbstractC5527h.f21104i));
        m9544d(sb, i7, 4096, resources.getString(AbstractC5527h.f21100e));
        m9544d(sb, i7, 2, resources.getString(AbstractC5527h.f21099d));
        m9544d(sb, i7, 1, resources.getString(AbstractC5527h.f21105j));
        m9544d(sb, i7, 4, resources.getString(AbstractC5527h.f21107l));
        m9544d(sb, i7, 8, resources.getString(AbstractC5527h.f21103h));
        if (cM9550g == '\b') {
            sb.append(resources.getString(AbstractC5527h.f21101f));
        } else if (cM9550g == '\n') {
            sb.append(resources.getString(AbstractC5527h.f21102g));
        } else if (cM9550g != ' ') {
            sb.append(cM9550g);
        } else {
            sb.append(resources.getString(AbstractC5527h.f21106k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f7721o != null;
    }

    /* JADX INFO: renamed from: i */
    CharSequence m9552i(InterfaceC2286k.a aVar) {
        return (aVar == null || !aVar.mo9416d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f7705D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f7731y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f7731y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f7731y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1035b abstractC1035b = this.f7703B;
        if (abstractC1035b == null || !abstractC1035b.mo4615f()) {
            return (this.f7731y & 8) == 0;
        }
        return (this.f7731y & 8) == 0 && this.f7703B.mo4611b();
    }

    /* JADX INFO: renamed from: j */
    public boolean m9553j() {
        AbstractC1035b abstractC1035b;
        if ((this.f7732z & 8) != 0) {
            if (this.f7702A == null && (abstractC1035b = this.f7703B) != null) {
                this.f7702A = abstractC1035b.mo4612c(this);
            }
            if (this.f7702A != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m9554k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f7723q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C2280e c2280e = this.f7720n;
        if (c2280e.mo9526h(c2280e, this)) {
            return true;
        }
        Runnable runnable = this.f7722p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f7713g != null) {
            try {
                this.f7720n.m9538w().startActivity(this.f7713g);
                return true;
            } catch (ActivityNotFoundException e7) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
            }
        }
        AbstractC1035b abstractC1035b = this.f7703B;
        return abstractC1035b != null && abstractC1035b.mo4613d();
    }

    /* JADX INFO: renamed from: l */
    public boolean m9555l() {
        return (this.f7731y & 32) == 32;
    }

    /* JADX INFO: renamed from: m */
    public boolean m9556m() {
        return (this.f7731y & 4) != 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m9557n() {
        return (this.f7732z & 1) == 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m9558o() {
        return (this.f7732z & 2) == 2;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0492b setActionView(int i7) {
        Context contextM9538w = this.f7720n.m9538w();
        setActionView(LayoutInflater.from(contextM9538w).inflate(i7, (ViewGroup) new LinearLayout(contextM9538w), false));
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0492b setActionView(View view) {
        int i7;
        this.f7702A = view;
        this.f7703B = null;
        if (view != null && view.getId() == -1 && (i7 = this.f7707a) > 0) {
            view.setId(i7);
        }
        this.f7720n.m9501L(this);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m9561r(boolean z7) {
        this.f7705D = z7;
        this.f7720n.mo9503N(false);
    }

    /* JADX INFO: renamed from: s */
    void m9562s(boolean z7) {
        int i7 = this.f7731y;
        int i8 = (z7 ? 2 : 0) | (i7 & (-3));
        this.f7731y = i8;
        if (i7 != i8) {
            this.f7720n.mo9503N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        if (this.f7716j == c7) {
            return this;
        }
        this.f7716j = Character.toLowerCase(c7);
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        int i7 = this.f7731y;
        int i8 = (z7 ? 1 : 0) | (i7 & (-2));
        this.f7731y = i8;
        if (i7 != i8) {
            this.f7720n.mo9503N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        if ((this.f7731y & 4) != 0) {
            this.f7720n.m9513Y(this);
            return this;
        }
        m9562s(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        if (z7) {
            this.f7731y |= 16;
        } else {
            this.f7731y &= -17;
        }
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f7719m = 0;
        this.f7718l = drawable;
        this.f7730x = true;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7726t = colorStateList;
        this.f7728v = true;
        this.f7730x = true;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7727u = mode;
        this.f7729w = true;
        this.f7730x = true;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f7713g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        if (this.f7714h == c7) {
            return this;
        }
        this.f7714h = c7;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7704C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7723q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f7714h = c7;
        this.f7716j = Character.toLowerCase(c8);
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f7732z = i7;
        this.f7720n.m9501L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f7711e = charSequence;
        this.f7720n.mo9503N(false);
        SubMenuC2288m subMenuC2288m = this.f7721o;
        if (subMenuC2288m != null) {
            subMenuC2288m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7712f = charSequence;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        if (m9568y(z7)) {
            this.f7720n.m9502M(this);
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m9563t(boolean z7) {
        this.f7731y = (z7 ? 4 : 0) | (this.f7731y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f7711e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public void m9564u(boolean z7) {
        if (z7) {
            this.f7731y |= 32;
        } else {
            this.f7731y &= -33;
        }
    }

    /* JADX INFO: renamed from: v */
    void m9565v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f7706E = contextMenuInfo;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0492b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void m9567x(SubMenuC2288m subMenuC2288m) {
        this.f7721o = subMenuC2288m;
        subMenuC2288m.setHeaderTitle(getTitle());
    }

    /* JADX INFO: renamed from: y */
    boolean m9568y(boolean z7) {
        int i7 = this.f7731y;
        int i8 = (z7 ? 0 : 8) | (i7 & (-9));
        this.f7731y = i8;
        return i7 != i8;
    }

    /* JADX INFO: renamed from: z */
    public boolean m9569z() {
        return this.f7720n.m9493C();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0492b setContentDescription(CharSequence charSequence) {
        this.f7724r = charSequence;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0492b setTooltipText(CharSequence charSequence) {
        this.f7725s = charSequence;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f7716j == c7 && this.f7717k == i7) {
            return this;
        }
        this.f7716j = Character.toLowerCase(c7);
        this.f7717k = KeyEvent.normalizeMetaState(i7);
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        if (this.f7714h == c7 && this.f7715i == i7) {
            return this;
        }
        this.f7714h = c7;
        this.f7715i = KeyEvent.normalizeMetaState(i7);
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f7714h = c7;
        this.f7715i = KeyEvent.normalizeMetaState(i7);
        this.f7716j = Character.toLowerCase(c8);
        this.f7717k = KeyEvent.normalizeMetaState(i8);
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f7718l = null;
        this.f7719m = i7;
        this.f7730x = true;
        this.f7720n.mo9503N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        return setTitle(this.f7720n.m9538w().getString(i7));
    }
}
