package org.jf.dexlib2.immutable.instruction;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.common.collect.ImmutableList;

import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.util.ImmutableConverter;

import java.util.List;

public class ImmutableSwitchElement implements SwitchElement {
    private static final ImmutableConverter<ImmutableSwitchElement, SwitchElement> CONVERTER =
            new ImmutableConverter<ImmutableSwitchElement, SwitchElement>() {
                @Override
                protected boolean isImmutable(@NonNull SwitchElement item) {
                    return item instanceof ImmutableSwitchElement;
                }

                @NonNull
                @Override
                protected ImmutableSwitchElement makeImmutable(@NonNull SwitchElement item) {
                    return ImmutableSwitchElement.of(item);
                }
            };
    protected final int key;
    protected final int offset;

    public ImmutableSwitchElement(int key,
                                  int offset) {
        this.key = key;
        this.offset = offset;
    }

    @NonNull
    public static ImmutableSwitchElement of(SwitchElement switchElement) {
        if (switchElement instanceof ImmutableSwitchElement) {
            return (ImmutableSwitchElement) switchElement;
        }
        return new ImmutableSwitchElement(
                switchElement.getKey(),
                switchElement.getOffset());
    }

    @NonNull
    public static ImmutableList<ImmutableSwitchElement> immutableListOf(@Nullable List<? extends SwitchElement> list) {
        return CONVERTER.toList(list);
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public int getOffset() {
        return offset;
    }
}
