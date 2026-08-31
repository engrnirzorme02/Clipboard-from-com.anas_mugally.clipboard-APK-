package p057H;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p111O.AbstractC1035b;

/* JADX INFO: renamed from: H.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC0492b extends MenuItem {
    /* JADX INFO: renamed from: a */
    InterfaceMenuItemC0492b mo2091a(AbstractC1035b abstractC1035b);

    /* JADX INFO: renamed from: b */
    AbstractC1035b mo2092b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i7);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0492b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c7, char c8, int i7, int i8);

    @Override // android.view.MenuItem
    void setShowAsAction(int i7);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0492b setTooltipText(CharSequence charSequence);
}
