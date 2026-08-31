package p295m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.AbstractC2436b;
import p041F.AbstractC0400a;
import p057H.InterfaceMenuItemC0492b;
import p111O.AbstractC1035b;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public class C6314a implements InterfaceMenuItemC0492b {

    /* JADX INFO: renamed from: a */
    private final int f24118a;

    /* JADX INFO: renamed from: b */
    private final int f24119b;

    /* JADX INFO: renamed from: c */
    private final int f24120c;

    /* JADX INFO: renamed from: d */
    private CharSequence f24121d;

    /* JADX INFO: renamed from: e */
    private CharSequence f24122e;

    /* JADX INFO: renamed from: f */
    private Intent f24123f;

    /* JADX INFO: renamed from: g */
    private char f24124g;

    /* JADX INFO: renamed from: i */
    private char f24126i;

    /* JADX INFO: renamed from: k */
    private Drawable f24128k;

    /* JADX INFO: renamed from: l */
    private Context f24129l;

    /* JADX INFO: renamed from: m */
    private MenuItem.OnMenuItemClickListener f24130m;

    /* JADX INFO: renamed from: n */
    private CharSequence f24131n;

    /* JADX INFO: renamed from: o */
    private CharSequence f24132o;

    /* JADX INFO: renamed from: h */
    private int f24125h = 4096;

    /* JADX INFO: renamed from: j */
    private int f24127j = 4096;

    /* JADX INFO: renamed from: p */
    private ColorStateList f24133p = null;

    /* JADX INFO: renamed from: q */
    private PorterDuff.Mode f24134q = null;

    /* JADX INFO: renamed from: r */
    private boolean f24135r = false;

    /* JADX INFO: renamed from: s */
    private boolean f24136s = false;

    /* JADX INFO: renamed from: t */
    private int f24137t = 16;

    public C6314a(Context context, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f24129l = context;
        this.f24118a = i8;
        this.f24119b = i7;
        this.f24120c = i10;
        this.f24121d = charSequence;
    }

    /* JADX INFO: renamed from: c */
    private void m27250c() {
        Drawable drawable = this.f24128k;
        if (drawable != null) {
            if (this.f24135r || this.f24136s) {
                Drawable drawableM1712r = AbstractC0400a.m1712r(drawable);
                this.f24128k = drawableM1712r;
                Drawable drawableMutate = drawableM1712r.mutate();
                this.f24128k = drawableMutate;
                if (this.f24135r) {
                    AbstractC0400a.m1709o(drawableMutate, this.f24133p);
                }
                if (this.f24136s) {
                    AbstractC0400a.m1710p(this.f24128k, this.f24134q);
                }
            }
        }
    }

    @Override // p057H.InterfaceMenuItemC0492b
    /* JADX INFO: renamed from: a */
    public InterfaceMenuItemC0492b mo2091a(AbstractC1035b abstractC1035b) {
        throw new UnsupportedOperationException();
    }

    @Override // p057H.InterfaceMenuItemC0492b
    /* JADX INFO: renamed from: b */
    public AbstractC1035b mo2092b() {
        return null;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0492b setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0492b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0492b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f24127j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f24126i;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f24131n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f24119b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f24128k;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f24133p;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f24134q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f24123f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f24118a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f24125h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f24124g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f24120c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f24121d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24122e;
        return charSequence != null ? charSequence : this.f24121d;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f24132o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f24137t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f24137t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f24137t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f24137t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f24126i = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f24137t = (z7 ? 1 : 0) | (this.f24137t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f24137t = (z7 ? 2 : 0) | (this.f24137t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f24137t = (z7 ? 16 : 0) | (this.f24137t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f24128k = drawable;
        m27250c();
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24133p = colorStateList;
        this.f24135r = true;
        m27250c();
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24134q = mode;
        this.f24136s = true;
        m27250c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f24123f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f24124g = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24130m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f24124g = c7;
        this.f24126i = Character.toLowerCase(c8);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f24121d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24122e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        this.f24137t = (this.f24137t & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f24126i = Character.toLowerCase(c7);
        this.f24127j = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0492b setContentDescription(CharSequence charSequence) {
        this.f24131n = charSequence;
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f24124g = c7;
        this.f24125h = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f24121d = this.f24129l.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0492b setTooltipText(CharSequence charSequence) {
        this.f24132o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f24128k = AbstractC2436b.getDrawable(this.f24129l, i7);
        m27250c();
        return this;
    }

    @Override // p057H.InterfaceMenuItemC0492b, android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f24124g = c7;
        this.f24125h = KeyEvent.normalizeMetaState(i7);
        this.f24126i = Character.toLowerCase(c8);
        this.f24127j = KeyEvent.normalizeMetaState(i8);
        return this;
    }
}
