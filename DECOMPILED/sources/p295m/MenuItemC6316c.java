package p295m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.InterfaceC2267c;
import java.lang.reflect.Method;
import p057H.InterfaceMenuItemC0492b;
import p111O.AbstractC1035b;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC6316c extends AbstractC6315b implements MenuItem {

    /* JADX INFO: renamed from: d */
    private final InterfaceMenuItemC0492b f24141d;

    /* JADX INFO: renamed from: e */
    private Method f24142e;

    /* JADX INFO: renamed from: m.c$a */
    private class a extends AbstractC1035b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d */
        private AbstractC1035b.b f24143d;

        /* JADX INFO: renamed from: e */
        private final ActionProvider f24144e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f24144e = actionProvider;
        }

        @Override // p111O.AbstractC1035b
        /* JADX INFO: renamed from: a */
        public boolean mo4610a() {
            return this.f24144e.hasSubMenu();
        }

        @Override // p111O.AbstractC1035b
        /* JADX INFO: renamed from: b */
        public boolean mo4611b() {
            return this.f24144e.isVisible();
        }

        @Override // p111O.AbstractC1035b
        /* JADX INFO: renamed from: c */
        public View mo4612c(MenuItem menuItem) {
            return this.f24144e.onCreateActionView(menuItem);
        }

        @Override // p111O.AbstractC1035b
        /* JADX INFO: renamed from: d */
        public boolean mo4613d() {
            return this.f24144e.onPerformDefaultAction();
        }

        @Override // p111O.AbstractC1035b
        /* JADX INFO: renamed from: e */
        public void mo4614e(SubMenu subMenu) {
            this.f24144e.onPrepareSubMenu(MenuItemC6316c.this.m27255d(subMenu));
        }

        @Override // p111O.AbstractC1035b
        /* JADX INFO: renamed from: f */
        public boolean mo4615f() {
            return this.f24144e.overridesItemVisibility();
        }

        @Override // p111O.AbstractC1035b
        /* JADX INFO: renamed from: i */
        public void mo4618i(AbstractC1035b.b bVar) {
            this.f24143d = bVar;
            this.f24144e.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z7) {
            AbstractC1035b.b bVar = this.f24143d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z7);
            }
        }
    }

    /* JADX INFO: renamed from: m.c$b */
    static class b extends FrameLayout implements InterfaceC2267c {

        /* JADX INFO: renamed from: a */
        final CollapsibleActionView f24146a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f24146a = (CollapsibleActionView) view;
            addView(view);
        }

        /* JADX INFO: renamed from: a */
        View m27261a() {
            return (View) this.f24146a;
        }

        @Override // androidx.appcompat.view.InterfaceC2267c
        /* JADX INFO: renamed from: c */
        public void mo9376c() {
            this.f24146a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.InterfaceC2267c
        /* JADX INFO: renamed from: f */
        public void mo9377f() {
            this.f24146a.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: m.c$c */
    private class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        private final MenuItem.OnActionExpandListener f24147a;

        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f24147a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f24147a.onMenuItemActionCollapse(MenuItemC6316c.this.m27254c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f24147a.onMenuItemActionExpand(MenuItemC6316c.this.m27254c(menuItem));
        }
    }

    /* JADX INFO: renamed from: m.c$d */
    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        private final MenuItem.OnMenuItemClickListener f24149a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f24149a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f24149a.onMenuItemClick(MenuItemC6316c.this.m27254c(menuItem));
        }
    }

    public MenuItemC6316c(Context context, InterfaceMenuItemC0492b interfaceMenuItemC0492b) {
        super(context);
        if (interfaceMenuItemC0492b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24141d = interfaceMenuItemC0492b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f24141d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f24141d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1035b abstractC1035bMo2092b = this.f24141d.mo2092b();
        if (abstractC1035bMo2092b instanceof a) {
            return ((a) abstractC1035bMo2092b).f24144e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f24141d.getActionView();
        return actionView instanceof b ? ((b) actionView).m27261a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f24141d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f24141d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f24141d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f24141d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f24141d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f24141d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f24141d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f24141d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f24141d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24141d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f24141d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f24141d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f24141d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m27255d(this.f24141d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f24141d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f24141d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f24141d.getTooltipText();
    }

    /* JADX INFO: renamed from: h */
    public void m27259h(boolean z7) {
        try {
            if (this.f24142e == null) {
                this.f24142e = this.f24141d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f24142e.invoke(this.f24141d, Boolean.valueOf(z7));
        } catch (Exception e7) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f24141d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f24141d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f24141d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f24141d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f24141d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f24141d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f24138a, actionProvider);
        InterfaceMenuItemC0492b interfaceMenuItemC0492b = this.f24141d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC0492b.mo2091a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f24141d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f24141d.setAlphabeticShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f24141d.setCheckable(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f24141d.setChecked(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f24141d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f24141d.setEnabled(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f24141d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24141d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24141d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f24141d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f24141d.setNumericShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24141d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24141d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f24141d.setShortcut(c7, c8);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
        this.f24141d.setShowAsAction(i7);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i7) {
        this.f24141d.setShowAsActionFlags(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f24141d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24141d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f24141d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        return this.f24141d.setVisible(z7);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f24141d.setAlphabeticShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f24141d.setIcon(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f24141d.setNumericShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f24141d.setShortcut(c7, c8, i7, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f24141d.setTitle(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i7) {
        this.f24141d.setActionView(i7);
        View actionView = this.f24141d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f24141d.setActionView(new b(actionView));
        }
        return this;
    }
}
