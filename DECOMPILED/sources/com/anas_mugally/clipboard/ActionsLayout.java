package com.anas_mugally.clipboard;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import androidx.appcompat.widget.AbstractC2358i0;
import androidx.core.content.AbstractC2436b;
import androidx.core.widget.AbstractC2454e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1608F;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p166V5.AbstractC1792a;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p278j6.AbstractC5905g;
import p371v1.C7210k;
import p405z3.C7611b;

/* JADX INFO: loaded from: classes.dex */
public final class ActionsLayout extends LinearLayout {
    private ColorStateList iconTint;
    private boolean isInEditMode;
    private final Map<Integer, ImageButton> itemViewMap;
    private Menu menu;
    private final List<MenuItem> menuItems;
    private MenuItem.OnMenuItemClickListener onMenuItemClickListener;
    private InterfaceC5371p onMoreAppsItemClickListener;
    private final C7210k popupHelper;
    private final InterfaceC1429g sharedPreferences$delegate;
    private final boolean supportSplitAndPopupView;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ActionsLayout$a */
    final class C3035a extends RecyclerView.AbstractC2757h {

        /* JADX INFO: renamed from: d */
        private final List f12472d;

        /* JADX INFO: renamed from: e */
        private final InterfaceC5371p f12473e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ ActionsLayout f12474f;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ActionsLayout$a$a */
        public final class a extends RecyclerView.AbstractC2749E {

            /* JADX INFO: renamed from: u */
            private final ImageView f12475u;

            /* JADX INFO: renamed from: v */
            private final CheckedTextView f12476v;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C3035a f12477w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3035a c3035a, View view) {
                super(view);
                AbstractC6118n.m27187e(view, "view");
                this.f12477w = c3035a;
                View viewFindViewById = this.f10894a.findViewById(android.R.id.icon);
                AbstractC6118n.m27186d(viewFindViewById, "findViewById(...)");
                this.f12475u = (ImageView) viewFindViewById;
                View viewFindViewById2 = this.f10894a.findViewById(android.R.id.text1);
                AbstractC6118n.m27186d(viewFindViewById2, "findViewById(...)");
                this.f12476v = (CheckedTextView) viewFindViewById2;
            }

            /* JADX INFO: renamed from: Q */
            public final CheckedTextView m15068Q() {
                return this.f12476v;
            }

            /* JADX INFO: renamed from: R */
            public final ImageView m15069R() {
                return this.f12475u;
            }
        }

        public C3035a(ActionsLayout actionsLayout, List activities, InterfaceC5371p onItemChecked) {
            AbstractC6118n.m27187e(activities, "activities");
            AbstractC6118n.m27187e(onItemChecked, "onItemChecked");
            this.f12474f = actionsLayout;
            this.f12472d = activities;
            this.f12473e = onItemChecked;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: D */
        public static final void m15065D(a aVar, C3036b c3036b, C3035a c3035a, View view) {
            aVar.m15068Q().setChecked(!aVar.m15068Q().isChecked());
            boolean zIsChecked = aVar.m15068Q().isChecked();
            c3036b.m15074e(zIsChecked);
            c3035a.f12473e.invoke(c3036b, Boolean.valueOf(zIsChecked));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void mo3682q(final a holder, int i7) {
            AbstractC6118n.m27187e(holder, "holder");
            final C3036b c3036b = (C3036b) this.f12472d.get(i7);
            holder.m15069R().setImageDrawable(c3036b.m15072c());
            holder.m15068Q().setText(c3036b.m15071b());
            holder.m15068Q().setChecked(c3036b.m15073d());
            holder.m15068Q().setChecked(c3036b.m15073d());
            holder.f10894a.setOnClickListener(new View.OnClickListener() { // from class: com.anas_mugally.clipboard.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActionsLayout.C3035a.m15065D(holder, c3036b, this, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public a mo3683s(ViewGroup parent, int i7) {
            AbstractC6118n.m27187e(parent, "parent");
            Context context = parent.getContext();
            float f7 = context.getResources().getDisplayMetrics().density;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new RecyclerView.C2766q(-1, -2));
            int i8 = (int) (16 * f7);
            int i9 = (int) (8 * f7);
            linearLayout.setPadding(i8, i9, i8, i9);
            linearLayout.setMinimumHeight((int) (56 * f7));
            linearLayout.setGravity(16);
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true)) {
                linearLayout.setBackgroundResource(typedValue.resourceId);
            }
            int i10 = (int) (40 * f7);
            ImageView imageView = new ImageView(context);
            imageView.setId(android.R.id.icon);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
            layoutParams.setMarginEnd((int) (12 * f7));
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            CheckedTextView checkedTextView = new CheckedTextView(context);
            checkedTextView.setId(android.R.id.text1);
            checkedTextView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            checkedTextView.setClickable(false);
            checkedTextView.setFocusable(false);
            checkedTextView.setTextSize(2, 16.0f);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.listChoiceIndicatorMultiple});
            AbstractC6118n.m27186d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                if (resourceId != 0) {
                    checkedTextView.setCheckMarkDrawable(resourceId);
                } else {
                    checkedTextView.setCheckMarkDrawable(android.R.drawable.checkbox_on_background);
                }
                linearLayout.addView(imageView);
                linearLayout.addView(checkedTextView);
                return new a(this, linearLayout);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
        /* JADX INFO: renamed from: g */
        public int mo8548g() {
            return this.f12472d.size();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ActionsLayout$b */
    public static final class C3036b {

        /* JADX INFO: renamed from: a */
        private final ComponentName f12478a;

        /* JADX INFO: renamed from: b */
        private final SpannableStringBuilder f12479b;

        /* JADX INFO: renamed from: c */
        private final Drawable f12480c;

        /* JADX INFO: renamed from: d */
        private boolean f12481d;

        public C3036b(ComponentName componentName, SpannableStringBuilder displayName, Drawable icon, boolean z7) {
            AbstractC6118n.m27187e(componentName, "componentName");
            AbstractC6118n.m27187e(displayName, "displayName");
            AbstractC6118n.m27187e(icon, "icon");
            this.f12478a = componentName;
            this.f12479b = displayName;
            this.f12480c = icon;
            this.f12481d = z7;
        }

        /* JADX INFO: renamed from: a */
        public final ComponentName m15070a() {
            return this.f12478a;
        }

        /* JADX INFO: renamed from: b */
        public final SpannableStringBuilder m15071b() {
            return this.f12479b;
        }

        /* JADX INFO: renamed from: c */
        public final Drawable m15072c() {
            return this.f12480c;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m15073d() {
            return this.f12481d;
        }

        /* JADX INFO: renamed from: e */
        public final void m15074e(boolean z7) {
            this.f12481d = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3036b)) {
                return false;
            }
            C3036b c3036b = (C3036b) obj;
            return AbstractC6118n.m27183a(this.f12478a, c3036b.f12478a) && AbstractC6118n.m27183a(this.f12479b, c3036b.f12479b) && AbstractC6118n.m27183a(this.f12480c, c3036b.f12480c) && this.f12481d == c3036b.f12481d;
        }

        public int hashCode() {
            return (((((this.f12478a.hashCode() * 31) + this.f12479b.hashCode()) * 31) + this.f12480c.hashCode()) * 31) + Boolean.hashCode(this.f12481d);
        }

        public String toString() {
            return "ActivityItem(componentName=" + this.f12478a + ", displayName=" + ((Object) this.f12479b) + ", icon=" + this.f12480c + ", isSelected=" + this.f12481d + ')';
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ActionsLayout$c */
    public enum EnumC3037c {
        SHARE,
        POPUP,
        SPLIT;


        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ InterfaceC2059a f12486e = AbstractC2060b.m8524a(m15075c());
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ActionsLayout$d */
    public static final class C3038d implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PackageManager f12487a;

        public C3038d(PackageManager packageManager) {
            this.f12487a = packageManager;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1792a.m7503a(this.f12487a.getApplicationLabel(((ResolveInfo) obj).activityInfo.applicationInfo).toString(), this.f12487a.getApplicationLabel(((ResolveInfo) obj2).activityInfo.applicationInfo).toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsLayout(Context context) {
        this(context, null, 0, 6, null);
        AbstractC6118n.m27187e(context, "context");
    }

    private final int calculateSquareItemSize(int i7, int i8) {
        int i9 = 0;
        Iterable iterableK = AbstractC5905g.m26663k(0, getChildCount());
        if (!(iterableK instanceof Collection) || !((Collection) iterableK).isEmpty()) {
            Iterator it = iterableK.iterator();
            while (it.hasNext()) {
                if (getChildAt(((AbstractC1608F) it).mo6617a()).getVisibility() != 8 && (i9 = i9 + 1) < 0) {
                    AbstractC1638q.m6772q();
                }
            }
        }
        return i9 > 0 ? Math.min(i7 / i9, i8) : Math.min(i7, i8);
    }

    private final ImageButton createActionButton(final MenuItem menuItem) {
        final ImageButton imageButton = new ImageButton(getContext());
        imageButton.setId(menuItem.getItemId());
        imageButton.setBackgroundResource(R.drawable.image_action_ripple);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        imageButton.setLayoutParams(layoutParams);
        Drawable icon = menuItem.getIcon();
        if (icon != null) {
            imageButton.setImageDrawable(icon);
        }
        ColorStateList colorStateList = this.iconTint;
        if (colorStateList != null) {
            AbstractC2454e.m10738c(imageButton, colorStateList);
        }
        imageButton.setContentDescription(menuItem.getTitle());
        AbstractC2358i0.m10085a(imageButton, menuItem.getTitle());
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.anas_mugally.clipboard.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionsLayout.createActionButton$lambda$11$lambda$10(menuItem, this, imageButton, view);
            }
        });
        return imageButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionButton$lambda$11$lambda$10(MenuItem menuItem, ActionsLayout actionsLayout, ImageButton imageButton, View view) {
        if (menuItem.getItemId() == R.id.more) {
            actionsLayout.showMoreAppsMenu(imageButton);
            return;
        }
        if (menuItem.hasSubMenu()) {
            actionsLayout.showSubMenu(imageButton, menuItem.getSubMenu());
            return;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = actionsLayout.onMenuItemClickListener;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
    }

    private final List<C7210k.a> createAdditionalActionsForComponent(final ComponentName componentName) {
        Drawable drawable = getContext().getDrawable(R.drawable.ic_call_split);
        String string = getContext().getString(R.string.open_in_split);
        AbstractC6118n.m27186d(string, "getString(...)");
        C7210k.a aVar = new C7210k.a(drawable, string, new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.h
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return ActionsLayout.createAdditionalActionsForComponent$lambda$18(this.f12609a, componentName);
            }
        });
        Drawable drawable2 = getContext().getDrawable(R.drawable.ic_open_in_new);
        String string2 = getContext().getString(R.string.open_in_popup);
        AbstractC6118n.m27186d(string2, "getString(...)");
        return AbstractC1638q.m6767l(aVar, new C7210k.a(drawable2, string2, new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.i
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return ActionsLayout.createAdditionalActionsForComponent$lambda$19(this.f12611a, componentName);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v createAdditionalActionsForComponent$lambda$18(ActionsLayout actionsLayout, ComponentName componentName) {
        InterfaceC5371p interfaceC5371p = actionsLayout.onMoreAppsItemClickListener;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(componentName, EnumC3037c.SPLIT);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v createAdditionalActionsForComponent$lambda$19(ActionsLayout actionsLayout, ComponentName componentName) {
        InterfaceC5371p interfaceC5371p = actionsLayout.onMoreAppsItemClickListener;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(componentName, EnumC3037c.POPUP);
        }
        return C1444v.f4971a;
    }

    private final ImageButton createDummyButton() {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setBackgroundResource(R.drawable.image_action_ripple);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageResource(android.R.drawable.ic_menu_share);
        ColorStateList colorStateList = this.iconTint;
        if (colorStateList != null) {
            AbstractC2454e.m10738c(imageButton, colorStateList);
        }
        return imageButton;
    }

    private final void createMenuItems() {
        removeAllViews();
        for (MenuItem menuItem : this.menuItems) {
            ImageButton imageButtonCreateActionButton = createActionButton(menuItem);
            addView(imageButtonCreateActionButton);
            this.itemViewMap.put(Integer.valueOf(menuItem.getItemId()), imageButtonCreateActionButton);
        }
        requestLayout();
    }

    private final void createPreviewButtons(int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            addView(createDummyButton());
        }
    }

    private final ArrayList<String> getSavedComponents() {
        Set<String> stringSet = getSharedPreferences().getStringSet("selected_components", AbstractC1617O.m6650d());
        if (stringSet == null) {
            stringSet = AbstractC1617O.m6650d();
        }
        return new ArrayList<>(stringSet);
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences$delegate.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    private final SpannableStringBuilder getSpannable(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (!AbstractC6118n.m27183a(str2, str)) {
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, spannableStringBuilder.length(), 33);
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true)) {
                try {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(typedValue.resourceId != 0 ? AbstractC2436b.getColor(getContext(), typedValue.resourceId) : typedValue.data), length, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                } catch (Exception unused) {
                }
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-7829368), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    private final boolean isComponentAvailable(ComponentName componentName, PackageManager packageManager) {
        try {
            packageManager.getActivityInfo(componentName, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeItem$lambda$29(int i7, MenuItem it) {
        AbstractC6118n.m27187e(it, "it");
        return it.getItemId() == i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveComponents(Set<String> set) {
        getSharedPreferences().edit().putStringSet("selected_components", set).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences sharedPreferences_delegate$lambda$0(Context context) {
        return context.getSharedPreferences("more_apps_prefs", 0);
    }

    private final boolean shouldShowComponent(String str) {
        Set<String> stringSet = getSharedPreferences().getStringSet("disabled_default_components", AbstractC1617O.m6650d());
        if (stringSet == null) {
            stringSet = AbstractC1617O.m6650d();
        }
        return !stringSet.contains(str);
    }

    private final void showAppSelectionDialog() {
        Drawable applicationIcon;
        PackageManager packageManager = getContext().getPackageManager();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        AbstractC6118n.m27186d(listQueryIntentActivities, "queryIntentActivities(...)");
        final Set setK0 = AbstractC1638q.m6597k0(getSavedComponents());
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : AbstractC1638q.m6588b0(listQueryIntentActivities, new C3038d(packageManager))) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            try {
                applicationIcon = resolveInfo.activityInfo.loadIcon(packageManager);
                AbstractC6118n.m27184b(applicationIcon);
            } catch (Exception unused) {
                applicationIcon = packageManager.getApplicationIcon(resolveInfo.activityInfo.applicationInfo);
                AbstractC6118n.m27184b(applicationIcon);
            }
            arrayList.add(new C3036b(componentName, getSpannable(packageManager.getApplicationLabel(resolveInfo.activityInfo.applicationInfo).toString(), resolveInfo.activityInfo.loadLabel(packageManager).toString()), applicationIcon, setK0.contains(componentName.flattenToString())));
        }
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new C3035a(this, arrayList, new InterfaceC5371p() { // from class: com.anas_mugally.clipboard.e
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return ActionsLayout.showAppSelectionDialog$lambda$23$lambda$22(setK0, (ActionsLayout.C3036b) obj, ((Boolean) obj2).booleanValue());
            }
        }));
        new C7611b(getContext()).m33365P(R.string.chose_app).mo9117u(recyclerView).m33361L(R.string.confirm, new DialogInterface.OnClickListener() { // from class: com.anas_mugally.clipboard.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                this.f12605a.saveComponents(setK0);
            }
        }).m33356G(R.string.cancel, null).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v showAppSelectionDialog$lambda$23$lambda$22(Set set, C3036b activityItem, boolean z7) {
        AbstractC6118n.m27187e(activityItem, "activityItem");
        String strFlattenToString = activityItem.m15070a().flattenToString();
        AbstractC6118n.m27186d(strFlattenToString, "flattenToString(...)");
        if (z7) {
            set.add(strFlattenToString);
        } else {
            set.remove(strFlattenToString);
        }
        return C1444v.f4971a;
    }

    private final void showMoreAppsMenu(View view) {
        int i7;
        boolean z7;
        Drawable applicationIcon;
        PackageManager packageManager = getContext().getPackageManager();
        ArrayList<String> savedComponents = getSavedComponents();
        AbstractC6112h abstractC6112h = null;
        savedComponents.add(null);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = savedComponents.iterator();
        while (true) {
            i7 = 2;
            z7 = false;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (str != null) {
                final ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null) {
                    AbstractC6118n.m27184b(packageManager);
                    if (isComponentAvailable(componentNameUnflattenFromString, packageManager)) {
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(componentNameUnflattenFromString, 0);
                            AbstractC6118n.m27186d(activityInfo, "getActivityInfo(...)");
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(componentNameUnflattenFromString.getPackageName(), 0);
                            AbstractC6118n.m27186d(applicationInfo, "getApplicationInfo(...)");
                            try {
                                applicationIcon = activityInfo.loadIcon(packageManager);
                                AbstractC6118n.m27184b(applicationIcon);
                            } catch (Exception unused) {
                                applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                                AbstractC6118n.m27184b(applicationIcon);
                            }
                            arrayList.add(new C7210k.d(getSpannable(packageManager.getApplicationLabel(applicationInfo).toString(), activityInfo.loadLabel(packageManager).toString()), new C7210k.b(applicationIcon, false), new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.m
                                @Override // p238e6.InterfaceC5356a
                                public final Object invoke() {
                                    return ActionsLayout.showMoreAppsMenu$lambda$16$lambda$13(this.f12619a, componentNameUnflattenFromString);
                                }
                            }, this.supportSplitAndPopupView ? new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.l
                                @Override // p238e6.InterfaceC5356a
                                public final Object invoke() {
                                    return ActionsLayout.showMoreAppsMenu$lambda$16$lambda$12(this.f12617a, componentNameUnflattenFromString);
                                }
                            } : null, this.supportSplitAndPopupView ? createAdditionalActionsForComponent(componentNameUnflattenFromString) : AbstractC1638q.m6765j()));
                        } catch (Exception unused2) {
                        }
                    }
                }
            } else {
                InterfaceC5356a interfaceC5356a = this.supportSplitAndPopupView ? new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.b
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return ActionsLayout.showMoreAppsMenu$lambda$16$lambda$14(this.f12573a);
                    }
                } : null;
                String string = getContext().getString(R.string.all_app);
                AbstractC6118n.m27186d(string, "getString(...)");
                arrayList.add(new C7210k.d(string, new C7210k.b(getContext().getDrawable(R.drawable.ic_share), z7, i7, abstractC6112h), new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.c
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return ActionsLayout.showMoreAppsMenu$lambda$16$lambda$15(this.f12595a);
                    }
                }, interfaceC5356a, this.supportSplitAndPopupView ? createAdditionalActionsForComponent(null) : AbstractC1638q.m6765j()));
            }
        }
        if (getContext() instanceof Activity) {
            String string2 = getContext().getString(R.string.add_new_app);
            AbstractC6118n.m27186d(string2, "getString(...)");
            arrayList.add(new C7210k.d(string2, new C7210k.b(getContext().getDrawable(R.drawable.round_add_circle_outline_24), z7, i7, abstractC6112h), new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.d
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return ActionsLayout.showMoreAppsMenu$lambda$17(this.f12596a);
                }
            }, null, null, 24, null));
        }
        C7210k.m31796O(this.popupHelper, view, arrayList, null, (!(getContext() instanceof Activity) || arrayList.size() <= 1) ? AbstractC1638q.m6765j() : AbstractC1638q.m6759d(Integer.valueOf(arrayList.size() - 1)), getContext() instanceof AiTextProcessingActivity, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v showMoreAppsMenu$lambda$16$lambda$12(ActionsLayout actionsLayout, ComponentName componentName) {
        InterfaceC5371p interfaceC5371p = actionsLayout.onMoreAppsItemClickListener;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(componentName, EnumC3037c.POPUP);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v showMoreAppsMenu$lambda$16$lambda$13(ActionsLayout actionsLayout, ComponentName componentName) {
        InterfaceC5371p interfaceC5371p = actionsLayout.onMoreAppsItemClickListener;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(componentName, EnumC3037c.SHARE);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v showMoreAppsMenu$lambda$16$lambda$14(ActionsLayout actionsLayout) {
        InterfaceC5371p interfaceC5371p = actionsLayout.onMoreAppsItemClickListener;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(null, EnumC3037c.POPUP);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v showMoreAppsMenu$lambda$16$lambda$15(ActionsLayout actionsLayout) {
        InterfaceC5371p interfaceC5371p = actionsLayout.onMoreAppsItemClickListener;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(null, EnumC3037c.SHARE);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v showMoreAppsMenu$lambda$17(ActionsLayout actionsLayout) {
        actionsLayout.showAppSelectionDialog();
        return C1444v.f4971a;
    }

    private final void showSubMenu(View view, SubMenu subMenu) {
        if (subMenu != null) {
            ArrayList arrayList = new ArrayList();
            int size = subMenu.size();
            for (int i7 = 0; i7 < size; i7++) {
                final MenuItem item = subMenu.getItem(i7);
                arrayList.add(new C7210k.d(String.valueOf(item.getTitle()), null, new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.g
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return ActionsLayout.showSubMenu$lambda$27$lambda$26(this.f12607a, item);
                    }
                }, null, null, 24, null));
            }
            C7210k.m31796O(this.popupHelper, view, arrayList, null, null, false, 28, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1444v showSubMenu$lambda$27$lambda$26(ActionsLayout actionsLayout, MenuItem menuItem) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = actionsLayout.onMenuItemClickListener;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
        return C1444v.f4971a;
    }

    public final void addAppToMoreMenu(String packageName) {
        AbstractC6118n.m27187e(packageName, "packageName");
    }

    public final void addComponentToMoreMenu(ComponentName componentName) {
        AbstractC6118n.m27187e(componentName, "componentName");
        Set<String> setK0 = AbstractC1638q.m6597k0(getSavedComponents());
        setK0.add(componentName.flattenToString());
        saveComponents(setK0);
    }

    public final void addItem(MenuItem menuItem) {
        AbstractC6118n.m27187e(menuItem, "menuItem");
        if (this.menu != null) {
            this.menuItems.add(menuItem);
            ImageButton imageButtonCreateActionButton = createActionButton(menuItem);
            addView(imageButtonCreateActionButton);
            this.itemViewMap.put(Integer.valueOf(menuItem.getItemId()), imageButtonCreateActionButton);
            requestLayout();
        }
    }

    public final void cleanup() {
        this.popupHelper.m31826n();
    }

    public final List<String> getAllSelectedApps() {
        List<ComponentName> allSelectedComponents = getAllSelectedComponents();
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(allSelectedComponents, 10));
        Iterator<T> it = allSelectedComponents.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComponentName) it.next()).getPackageName());
        }
        return AbstractC1638q.m6565E(arrayList);
    }

    public final List<ComponentName> getAllSelectedComponents() {
        ComponentName componentNameUnflattenFromString;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = getContext().getPackageManager();
        for (String str : getSavedComponents()) {
            if (str != null && (componentNameUnflattenFromString = ComponentName.unflattenFromString(str)) != null) {
                AbstractC6118n.m27184b(packageManager);
                if (isComponentAvailable(componentNameUnflattenFromString, packageManager)) {
                    arrayList.add(componentNameUnflattenFromString);
                }
            }
        }
        return arrayList;
    }

    public final Map<Integer, ImageButton> getItemViewMap() {
        return this.itemViewMap;
    }

    public final Menu getMenu() {
        return this.menu;
    }

    public final void hideItem(int i7) {
        MenuItem menuItemFindItem;
        ImageButton imageButton = this.itemViewMap.get(Integer.valueOf(i7));
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        Menu menu = this.menu;
        if (menu != null && (menuItemFindItem = menu.findItem(i7)) != null) {
            menuItemFindItem.setVisible(false);
        }
        requestLayout();
    }

    public final void inflateMenu(int i7) {
        if (this.isInEditMode) {
            return;
        }
        PopupMenu popupMenu = new PopupMenu(getContext(), this);
        new MenuInflater(getContext()).inflate(i7, popupMenu.getMenu());
        Menu menu = popupMenu.getMenu();
        AbstractC6118n.m27186d(menu, "getMenu(...)");
        setMenu(menu);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cleanup();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        if (getChildCount() <= 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        int iCalculateSquareItemSize = calculateSquareItemSize(size, size2);
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                i9++;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                AbstractC6118n.m27185c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = iCalculateSquareItemSize;
                layoutParams2.height = iCalculateSquareItemSize;
                childAt.setLayoutParams(layoutParams2);
            }
        }
        if (mode != 1073741824) {
            size = i9 == 0 ? 0 : iCalculateSquareItemSize * i9;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode == 1073741824 ? 1073741824 : Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iCalculateSquareItemSize, mode2 != 1073741824 ? Integer.MIN_VALUE : 1073741824));
    }

    public final void removeAppFromMoreMenu(String packageName) {
        AbstractC6118n.m27187e(packageName, "packageName");
    }

    public final void removeComponentFromMoreMenu(ComponentName componentName) {
        AbstractC6118n.m27187e(componentName, "componentName");
        Set<String> setK0 = AbstractC1638q.m6597k0(getSavedComponents());
        setK0.remove(componentName.flattenToString());
        saveComponents(setK0);
    }

    public final void removeItem(final int i7) {
        ImageButton imageButton = this.itemViewMap.get(Integer.valueOf(i7));
        if (imageButton != null) {
            removeView(imageButton);
            this.itemViewMap.remove(Integer.valueOf(i7));
        }
        Menu menu = this.menu;
        if (menu != null) {
            menu.removeItem(i7);
        }
        AbstractC1638q.m6783z(this.menuItems, new InterfaceC5367l() { // from class: com.anas_mugally.clipboard.a
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ActionsLayout.removeItem$lambda$29(i7, (MenuItem) obj));
            }
        });
        requestLayout();
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.iconTint = colorStateList;
        for (ImageButton imageButton : this.itemViewMap.values()) {
            if (imageButton != null) {
                AbstractC2454e.m10738c(imageButton, this.iconTint);
            }
        }
    }

    public final void setMenu(Menu menu) {
        AbstractC6118n.m27187e(menu, "menu");
        this.menu = menu;
        this.menuItems.clear();
        this.itemViewMap.clear();
        removeAllViews();
        int size = menu.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible()) {
                List<MenuItem> list = this.menuItems;
                AbstractC6118n.m27184b(item);
                list.add(item);
            }
        }
        createMenuItems();
    }

    public final void setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.onMenuItemClickListener = listener;
    }

    public final void setOnMoreAppsItemClickListener(InterfaceC5371p listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.onMoreAppsItemClickListener = listener;
    }

    public final void showItem(int i7) {
        MenuItem menuItemFindItem;
        ImageButton imageButton = this.itemViewMap.get(Integer.valueOf(i7));
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
        Menu menu = this.menu;
        if (menu != null && (menuItemFindItem = menu.findItem(i7)) != null) {
            menuItemFindItem.setVisible(true);
        }
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC6118n.m27187e(context, "context");
    }

    public /* synthetic */ ActionsLayout(Context context, AttributeSet attributeSet, int i7, int i8, AbstractC6112h abstractC6112h) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsLayout(final Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        AbstractC6118n.m27187e(context, "context");
        this.supportSplitAndPopupView = Build.VERSION.SDK_INT >= 28;
        this.menuItems = new ArrayList();
        this.itemViewMap = new LinkedHashMap();
        this.popupHelper = new C7210k(context);
        this.sharedPreferences$delegate = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.j
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return ActionsLayout.sharedPreferences_delegate$lambda$0(context);
            }
        });
        setOrientation(0);
        setGravity(17);
        this.isInEditMode = context.getContentResolver() == null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3151y.f13320f);
            AbstractC6118n.m27186d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    this.iconTint = typedArrayObtainStyledAttributes.getColorStateList(0);
                }
                if (resourceId != -1) {
                    if (this.isInEditMode) {
                        createPreviewButtons(3);
                    } else {
                        inflateMenu(resourceId);
                    }
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }
}
