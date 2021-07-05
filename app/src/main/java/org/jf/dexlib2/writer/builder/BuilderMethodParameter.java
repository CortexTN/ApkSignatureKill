/*
 * Copyright 2013, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.jf.dexlib2.writer.builder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jf.dexlib2.base.BaseMethodParameter;

public class BuilderMethodParameter extends BaseMethodParameter {
    @NonNull
    final BuilderTypeReference type;
    @Nullable
    final BuilderStringReference name;
    @NonNull
    final BuilderAnnotationSet annotations;

    public BuilderMethodParameter(@NonNull BuilderTypeReference type,
                                  @Nullable BuilderStringReference name,
                                  @NonNull BuilderAnnotationSet annotations) {
        this.type = type;
        this.name = name;
        this.annotations = annotations;
    }

    @NonNull
    @Override
    public String getType() {
        return type.getType();
    }

    @Nullable
    @Override
    public String getName() {
        return name == null ? null : name.getString();
    }

    @NonNull
    @Override
    public BuilderAnnotationSet getAnnotations() {
        return annotations;
    }
}
